package com.cts.training.middle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.IPODAO;
import com.cts.training.dao.RegisterDAO;
import com.cts.training.model.Company;
import com.cts.training.model.IPO;
import com.cts.training.model.Register;

@Controller
public class HomeController {
	@Autowired
	private RegisterDAO registerDAO;
	@Autowired
	private CompanyDAO companyDAO;
	@Autowired
	private IPODAO ipoDAO;
//	private IPODAO ipoDAO;
	
	//@GetMapping("/")--> In spring 4.3 version //inside braces we should give the urlpattern given in web.xml
	
@RequestMapping("/header")
	
	public String Headerpage(Model model) {	
		
		 
		 return "Header";			
		}
	@RequestMapping("/")
	
	public String indexpage(Model model) {
		
	model.addAttribute("message","Welcome to Spring MVC");
		
	  List<String> names = new ArrayList<String>();
	
		  
//		  List<Company> companies = companyDAO.getAllCompany();
//		  model.addAttribute("list1", companies);

	//addNames(names);
//	model.addAttribute("List",names);
		return "Register";//file name of jsp is index
//		return "Company";
	}
	
	@RequestMapping("/company")
	public String Companypage(Model model) {
		
		model.addAttribute("message","Welcome to Spring MVC");

		 
		List<Company> companies = companyDAO.getAllCompany();
		model.addAttribute("list1", companies);

	
			return "Company";
		}
	
	@RequestMapping("/IPO")
	
	public String IPOpage(Model model) {
		
		model.addAttribute("message","Welcome to Spring MVC");

		 List<IPO> ipos = ipoDAO.getAllIPOs();
		 model.addAttribute("list3", ipos);
		 
		 return "IPO";			
		}
	
	
	
	
	
	
	/*
	 * private void addNames(List<String> names) { names.add("Divya");
	 * names.add("Hameem"); names.add("Aneena"); names.add("Malavika");
	 * names.add("Sindhu"); }
	 */

}