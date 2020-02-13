package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.model.Company;


@Controller
public class CompanyController {
	@Autowired
	CompanyDAO companyDAO;
	@GetMapping("/company-home")
	public String userPage(Model model)
	{
		List<Company> companies = companyDAO.getAllCompany(); 
		  model.addAttribute("list", companies);
	 
		model.addAttribute("company", new Company());
		return "companies";
	}

}
