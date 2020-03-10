package com.cts.training.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;



@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	RegisterRepo registerRepo;
	@Autowired
	JavaMailSender javaMailSender;
	@Override
	public Register addUser(Register register) {
		registerRepo.save(register);
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom("gspsadhika@gmail.com");
			message.setTo(register.getEmail());
			message.setSubject("verfication mail");
			message.setText("Account created click on <a href='http://localhost:4200/activate?"+register.getEmail()+"'>Click</a>");
			javaMailSender.send(message);
			System.out.println("sending mail.....");
			}
		catch(Exception e) {e.printStackTrace();}
		return register;
	}
	@Override
	public String activate(@RequestBody String email) {
		String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
	System.out.println("email ::"+str);
	Register register = registerRepo.findByEmail(str);
	System.out.println("uname :"+ register.getEmail());
	register.setActive(true);
    register = registerRepo.save(register);
       return "{\"status\":\"ok\"}";
	}
//	public String addUser(Register registerDTO) {
//		Register register=new Register();
//		String email;
//		try {
//			SimpleMailMessage message= new SimpleMailMessage();
//			message.setFrom("gspsadhika@gmail.com");
//			message.setTo(registerDTO.getEmail());
//			email=registerDTO.getEmail();
//			if(registerRepo.findByEmail(email)!= null) {
//				return "{\"res\":\"0\"}";
//			}
//			else {
//				BeanUtils.copyProperties(registerDTO, register);
//				registerRepo.save(register);
//				message.setSubject("Activation Mail");
//				message.setText("Account Created Click on 'http://localhost:4200/activate?"+register.getEmail()+"'");
//				javaMailSender.send(message);
//				System.out.println("Sending Mail.........");
//				return "{\"res\":\"1\"}";
//			}
//		}
//		catch(Exception e){
//			e.printStackTrace();
//			return "{\"res\":\"2\"}";
//		}
//	}
	@Override
	public List<Register> getAllUsers(){
		List<Register> entities = registerRepo.findAll();
		List<Register> registerList = new ArrayList<Register>();
		for(Register entity: entities) {
			Register register = new Register();
			BeanUtils.copyProperties(entity, register);
			registerList.add(register);
		}
		System.out.println("Entity: "+entities);
		System.out.println("DTO: "+registerList);
		return registerList;
	}
	@Override
	public void deleteUser(int id) {
		registerRepo.deleteById(id);
	}
	@Override
	public Register getUserById(int id){
		Optional<Register> users = registerRepo.findById(id);
		Register register = new Register();
		BeanUtils.copyProperties(users.orElse(new Register()), register);
		return register;
	}
	@Override
	public Register updateUser(Register register) {
		Register register2 = new Register();
		BeanUtils.copyProperties(register, register2);
		BeanUtils.copyProperties(registerRepo.save(register2),register);
		return register;
	}
//	@Override
//	public Register findByUsernameAndPassword(String username, String password) {
//		Register register = registerRepo.findByUsernameAndPassword(username, password);
//		return register;
//	}
}