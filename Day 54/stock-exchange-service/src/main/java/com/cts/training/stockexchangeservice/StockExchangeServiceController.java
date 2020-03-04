package com.cts.training.stockexchangeservice;

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
public class StockExchangeServiceController {
	
	@Autowired
	StockExchangeRepo stockexchangeRepo;
	
	@Autowired
	StockExchangeService stockexchangeService;
	
	@RequestMapping(value="/stockexchange", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<StockExchange> findAll()
	{
		return stockexchangeService.getAllStockExchanges();
		
	}
	
		
	@RequestMapping(value="/stockexchange", method=RequestMethod.POST)
	public StockExchange save(@RequestBody StockExchange stockex)	
	{
		StockExchange stockexchange = stockexchangeService.insert(stockex);
		return stockexchange ;
	}
	
	@RequestMapping(value="/stockexchange/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id)
	{
		stockexchangeRepo.deleteById(id);
	}
	@RequestMapping(value="/update-stockexchange", method=RequestMethod.PUT)
	public StockExchange update(@RequestBody StockExchange stockex)
	{
		StockExchange stockexchange= stockexchangeService.update(stockex);
		return stockexchange;
	}
	
	@GetMapping(value="stockexchange/{id}", produces="application/json")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id)
		{
			try
			{
				StockExchange stockexchange = stockexchangeService.getElementById(id);
				return new ResponseEntity<StockExchange>(stockexchange, HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<String>("No such stockexchange is found", HttpStatus.NOT_FOUND);
				
			}
		}

}
