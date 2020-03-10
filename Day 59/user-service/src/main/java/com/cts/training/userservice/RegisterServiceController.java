package com.cts.training.userservice;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController
public class RegisterServiceController {
	
	@Autowired
	RegisterRepo registerRepo;
	
	@Autowired
	RegisterService registerService;

	@GetMapping(value="/register",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllUsers(){
		List<Register> list = registerService.getAllUsers();
		if(list.size()>0) {
			return new ResponseEntity<List<Register>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping(value="/register/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getUserById(@PathVariable int id)
	{
		try {
			Register register =  registerService.getUserById(id);
			return new ResponseEntity<Register>(register, HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<String>("no such user", HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping(value="/register")
	public ResponseEntity<?> addUser(@RequestBody Register register){
	try {
		registerService.addUser(register);
		return new ResponseEntity<Register>(register, HttpStatus.OK);
   	}catch (Exception e) {
   		return new ResponseEntity<String>("cannot add user", HttpStatus.NOT_FOUND);
   	}
  }
	
	@DeleteMapping(value="/register/{id}")
	//public void  deleteUser(@PathVariable int id){
	public ResponseEntity<?> deleteUser(@PathVariable int id){
		try {
		 registerService.deleteUser(id);
		return new ResponseEntity<Register>( HttpStatus.OK);
	}
		catch(Exception e) {
			return new ResponseEntity<Register>( HttpStatus.OK);
		}
	}
	
	@PutMapping(value = "/register")
	public ResponseEntity<Register> update(@RequestBody Register register) {
	register = registerService.updateUser(register);
	return new ResponseEntity<Register>(register,HttpStatus.OK);
	}
	
	@PutMapping(value="/activate")
	public ResponseEntity<String> activate(@RequestBody String email)
	{
		registerService.activate(email);
		return new ResponseEntity<String>(email,HttpStatus.CREATED);
	}
	
	@GetMapping(value= "/register")
	public ResponseEntity<?> login(){
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
