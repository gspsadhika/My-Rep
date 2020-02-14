package com.cts.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String IndexPage()
	{
		return "index";
	}
    @RequestMapping("/admin")
    public String adminPage()
    {
    	return "admin";
    }
    @RequestMapping("/hr")
    public String hrPage()
    {
    	return "hr";
    }
    
    @RequestMapping("/employee")
    public String employeePage()
    {
    	return "employee";
    }
}



