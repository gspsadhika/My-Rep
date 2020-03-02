package com.cts.training.companyservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
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
		return companyRepo.findAll();
	}
	
	@RequestMapping(value="/company/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Company findone(@PathVariable int id )
	{
		Optional<Company> com= companyRepo.findById(id);
		Company company= com.get();
		return company;
	}
	
	@RequestMapping(value="/company", method=RequestMethod.POST)
	public Company save(@RequestBody Company com)	
	{
		Company co = companyRepo.save(com);
		return co;
	}
	
	@RequestMapping(value="/company/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id)
	{
		companyRepo.deleteById(id);
	}
	@RequestMapping(value="/update-company", method=RequestMethod.PUT)
	public Company update(@RequestBody Company com)
	{
		Company co= companyRepo.save(com);
		return co;
	}
	
	

}
