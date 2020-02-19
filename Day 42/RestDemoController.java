package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.dao.RegisterDAO;
import com.cts.training.model.Register;

@RestController
public class RestDemoController {
	
	@Autowired
	RegisterDAO registerDAO;
	
	@RequestMapping(value = "/allUsers",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Register> getUsers(){
		return registerDAO.getAllUsers();
	}
}
