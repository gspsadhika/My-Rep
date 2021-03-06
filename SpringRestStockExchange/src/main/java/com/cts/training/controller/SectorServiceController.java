package com.cts.training.controller;

import java.io.Serializable;
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

import com.cts.training.model.Register;
import com.cts.training.model.Sector;
import com.cts.training.repo.RegisterRepo;
import com.cts.training.repo.SectorRepo;

@CrossOrigin(origins="*")
@RestController

public class SectorServiceController {
		@Autowired
		SectorRepo sr;
		
		@RequestMapping(value="/sector", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Sector> findAll(){
			return sr.findAll();
		}
		@RequestMapping(value="/sector/{id}", method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
		public Sector findone(@PathVariable int id){
			Optional<Sector> sec = sr.findById(id);
			Sector sector = sec.get();
			return sector;
		}
		@RequestMapping(value="/sector", method= RequestMethod.POST)
		public Sector save(@RequestBody Sector sec){
			Sector sector = sr.save(sec);
			return sector;
		}
		@RequestMapping(value="/sector/{id}", method= RequestMethod.DELETE)
		public void delete(@PathVariable int id){
			sr.deleteById(id);
		}
		@RequestMapping(value = "/sector", method = RequestMethod.PUT)
		public Sector update(@RequestBody Sector sec) {
			Sector sector = sr.save(sec);
			return sector;
		}
	}
