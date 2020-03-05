package com.cts.training.companyservice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

public class CompanyServiceController  {
	
Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CompanyRepo companyRepo;
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	IPOServiceProxy proxy;
	
	@GetMapping("/company")
	public List<Company> findAll()
	{
		return companyService.getAllCompanies();
		
	}	
		
	@PostMapping("/company")
	public Company save(@RequestBody Company com)	
	{
		Company company = companyService.insert(com);
		return company;
	}
	
	@DeleteMapping("/company/{id}")
	public void delete(@PathVariable("id") int id)
	{
		companyRepo.deleteById(id);
	}
	@PutMapping("/update-company")
	public Company update(@RequestBody Company com)
	{
		Company company= companyService.update(com);
		return company;
	}
	
	@GetMapping(value="company/{id}", produces="application/json")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id)
		{
			try
			{
				Company company = companyService.getElementById(id);
				return new ResponseEntity<Company>(company, HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<String>("No such company is found", HttpStatus.NOT_FOUND);
				
			}
		}
	@GetMapping(value="ipos-by-company", produces="application/json")
	public List<IPO> getAllIpos()
	{   
		logger.info("Get all ipos...");
		List<IPO> ipo = proxy.findAll();
		logger.info("Information --> {}", ipo );
		return ipo;
	}
	
	

}
