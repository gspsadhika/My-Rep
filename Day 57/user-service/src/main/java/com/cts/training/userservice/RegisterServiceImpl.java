package com.cts.training.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;



@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	RegisterRepo registerRepo;	
	
	@Override
	public RegisterDTO insert(RegisterDTO rd)
	{
		Register reg= new Register();
		BeanUtils.copyProperties(rd, reg);
		registerRepo.save(reg);
		return rd;
	}
    @Override
    public RegisterDTO update(RegisterDTO rd)
    {
    	Register reg= new Register();
    	BeanUtils.copyProperties(rd, reg);
    	BeanUtils.copyProperties(registerRepo.save(reg),rd);
    	return rd; 	
    	
    	
    }
	@Override
	public void delete(int id) {
		registerRepo.deleteById(id);
		
	}
    
	 @Override
	 public RegisterDTO getElementById(int id) throws java.util.NoSuchElementException
	 {
		 Optional<Register> reg= registerRepo.findById(id);
		 RegisterDTO registerDTO= new RegisterDTO();
		 BeanUtils.copyProperties(reg.get(), registerDTO);
		 return registerDTO;
	 }
	 @Override
		public List<RegisterDTO> getAllUsers(){
			List<Register> entities = registerRepo.findAll();
			List<RegisterDTO> registerList = new ArrayList<RegisterDTO>();
			for(Register entity: entities) {
				RegisterDTO registerDTO = new RegisterDTO();
				BeanUtils.copyProperties(entity, registerDTO);
				registerList.add(registerDTO);
			}
			System.out.println("Entity: "+entities);
			System.out.println("DTO: "+registerList);
			return registerList;
		}
	 }

