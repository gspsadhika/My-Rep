package com.cts.training.stockpriceservice;

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
public class StockPriceServiceController {

	@Autowired
	StockPriceRepo stockpriceRepo;
	
	@Autowired
	StockPriceService stockpriceService;
	
	@RequestMapping(value="/stockprice", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<StockPrice> findAll()
	{
		return stockpriceService.getAllPrices();
		
	}
	
		
	@RequestMapping(value="/stockprice", method=RequestMethod.POST)
	public StockPrice save(@RequestBody StockPrice stockpr)	
	{
		StockPrice stockprice = stockpriceService.insert(stockpr);
		return stockprice ;
	}
	
	@RequestMapping(value="/stockprice/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id)
	{
		stockpriceRepo.deleteById(id);
	}
	@RequestMapping(value="/update-stockprice", method=RequestMethod.PUT)
	public StockPrice update(@RequestBody StockPrice stockpr)
	{
		StockPrice stockprice= stockpriceService.update(stockpr);
		return stockprice;
	}
	
	@GetMapping(value="stockprice/{id}", produces="application/json")
	public ResponseEntity<?> getElementById(@PathVariable("id") int id)
		{
			try
			{
				StockPrice stockprice = stockpriceService.getElementById(id);
				return new ResponseEntity<StockPrice>(stockprice, HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<String>("No such stockprice is found", HttpStatus.NOT_FOUND);
				
			}
		}

}
