package com.cts.training.initialpublicofferingservice;

import java.util.List;
import java.util.NoSuchElementException;

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
public class IPOServiceController {
	@Autowired
	IPORepo ipoRepo;
	
	@Autowired
   IPOService ipoService;
	
	@RequestMapping(value="/ipo", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<IPO> findAll()
	{
		return ipoService.getAllIpos();
		
	}
	
		
	@RequestMapping(value="/ipo", method=RequestMethod.POST)
	public IPO save(@RequestBody IPO ipo1)	
	{
		IPO ipo = ipoService.insert(ipo1);
		return ipo;
	}
	
	@RequestMapping(value="/ipo/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id)
	{
		ipoRepo.deleteById(id);
	}
	@RequestMapping(value="/update-ipo", method=RequestMethod.PUT)
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
