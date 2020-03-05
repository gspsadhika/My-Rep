package com.cts.training.initialpublicofferingservice;

import java.util.List;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins="*")
@RestController
public class IPOServiceController {
	@Autowired
	IPORepo ipoRepo;
	
	@Autowired
   IPOService ipoService;
	
	@GetMapping("/ipo")
	public List<IPO> findAll()
	{
		return ipoService.getAllIpos();
		
	}	
		
	@PostMapping(value="/ipo")
	public IPO save(@RequestBody IPO ipo1)	
	{
		IPO ipo = ipoService.insert(ipo1);
		return ipo;
	}
	
	@DeleteMapping("/ipo/{id}")
	public void delete(@PathVariable("id") int id)
	{
		ipoRepo.deleteById(id);
	}
	
	@PutMapping("/update-ipo")
	public IPO update(@RequestBody IPO ipo1)
	{
		IPO ipo= ipoService.update(ipo1);
		return ipo;
	}
	
	@GetMapping(value="ipo/{id}", produces="application/json")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id)
		{
			try
			{
				IPO ipo = ipoService.getElementById(id);
				return new ResponseEntity<IPO>(ipo, HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<String>("No such IPO is found", HttpStatus.NOT_FOUND);
				
			}
		}
	


}
