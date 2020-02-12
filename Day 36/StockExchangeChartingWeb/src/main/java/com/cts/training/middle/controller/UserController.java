package com.cts.training.middle.controller;

import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.training.dao.RegisterDAO;
import com.cts.training.model.Register;

@Controller
public class UserController {
	@Autowired
	RegisterDAO registerDAO;
	@GetMapping("/user-home")
	public String userPage(Model model)
	{
		List<Register> users = registerDAO.getAllUsers(); 
		  model.addAttribute("list", users);
	 
		model.addAttribute("user", new Register());
		return "users";
	}
	@PostMapping("/user/save")
	//@RequestMapping(value="/user/save", method= RequestMethod.POST)
	public String addUser(@ModelAttribute("user") Register register) {//gets data from the form
		registerDAO.saveUser(register);
		
		return "redirect:/user-home";
	}
	@GetMapping("/remove/{id}")//{}-->path Variable
	public String deleteUser(@PathVariable("id") int id) {//to get path variable dynamic or we can use @RequestParam
		Register user = registerDAO.getUserById(id);
		registerDAO.deleteUser(user);
		return "redirect:/user-home";
		
	}
	@GetMapping()
	public String updateUser() {
		
		
		return "";
	}
}
