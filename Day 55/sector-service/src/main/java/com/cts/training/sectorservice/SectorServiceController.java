package com.cts.training.sectorservice;

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
public class SectorServiceController {
	
	@Autowired
	SectorRepo sectorRepo;
	
	@Autowired
	SectorService sectorService;
	
	@RequestMapping(value="/sector", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Sector> findAll()
	{
		return sectorService.getAllSectors();
		
	}	
		
	@RequestMapping(value="/sector", method=RequestMethod.POST)
	public Sector save(@RequestBody Sector sec)	
	{
		Sector sector = sectorService.insert(sec);
		return sector;
	}
	
	@RequestMapping(value="/sector/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id)
	{
		sectorRepo.deleteById(id);
	}
	@RequestMapping(value="/update-sector", method=RequestMethod.PUT)
	public Sector update(@RequestBody Sector sec)
	{
		Sector sector=  sectorService.update(sec);
		return sector;
	}
	
	@GetMapping(value="sector/{id}", produces="application/json")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id)
		{
			try
			{
				Sector sector = sectorService.getElementById(id);
				return new ResponseEntity<Sector>(sector, HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<String>("No such sector is found", HttpStatus.NOT_FOUND);
				
			}
		}

}
