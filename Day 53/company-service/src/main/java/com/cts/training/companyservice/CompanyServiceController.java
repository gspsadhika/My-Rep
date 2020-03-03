package com.cts.training.companyservice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*")
@RestController

public class CompanyServiceController  {
	

	@Autowired
	CompanyRepo companyRepo;
	
	@Autowired
	CompanyService companyService;
	
	@RequestMapping(value="/company", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Company> findAll()
	{
		return companyService.getAllCompanies();
		
	}	
		
	@RequestMapping(value="/company", method=RequestMethod.POST)
	public Company save(@RequestBody Company com)	
	{
		Company company = companyService.insert(com);
		return company;
	}
	
	@RequestMapping(value="/company/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id)
	{
		companyRepo.deleteById(id);
	}
	@RequestMapping(value="/update-company", method=RequestMethod.PUT)
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
	
	

}
