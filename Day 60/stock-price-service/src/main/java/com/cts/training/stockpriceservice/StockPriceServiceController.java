package com.cts.training.stockpriceservice;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins="*")
@RestController
public class StockPriceServiceController {

	@Autowired
	StockPriceRepo stockpriceRepo;
	
	@Autowired
	StockPriceService stockpriceService;
	
	@GetMapping(value="/stockprice",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllStockPrices(){
	  List<StockPrice> list = stockpriceService.getAllStockPrices();
	  if(list.size()>0) {
		  return  new ResponseEntity<List<StockPrice>>(list, HttpStatus.OK);
	  }
	  else {
		  return  new ResponseEntity<String>("No StockPrices", HttpStatus.OK);
	  }
	}
		
	@PostMapping(value="/stockprice")
	public ResponseEntity<?> addStockPrice(@RequestBody StockPrice stockprice)	
	{
		StockPrice stockpr = stockpriceService.addStockPrice(stockprice);
		return new ResponseEntity<StockPrice>(stockpr, HttpStatus.OK);
	}
		
	@DeleteMapping(value="/stockprice/{id}")
	public ResponseEntity<?> deleteStockPrice(@PathVariable("id") int id)
	{
		stockpriceService.deleteStockPrice(id);
		return new ResponseEntity<StockPrice>(HttpStatus.OK);
	}
	@PutMapping(value="/update-stockprice")
	public ResponseEntity<?> updateStockPrice(@RequestBody StockPrice stockprice)
	{
		StockPrice stockpr= stockpriceService.updateStockPrice(stockprice);
		return new ResponseEntity<StockPrice>(stockpr, HttpStatus.OK);
	}
	
	@GetMapping(value="stockprice/{id}", produces="application/json")
	public ResponseEntity<?> getStockPriceById(@PathVariable("id") int id)
		{
			try
			{
				StockPrice stockprice = stockpriceService.getStockPriceById(id);
				return new ResponseEntity<StockPrice>(stockprice, HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<String>("No such stockprice is found", HttpStatus.NOT_FOUND);
				
			}
		}
	
	@PostMapping(value="stockprice/uploadStocksSheet", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> uploadStocksSheet(@RequestParam ("stocksSheet") MultipartFile file)
	{
		//logger.info("File received: {}", file.getOriginalFilename());
		if(file.getOriginalFilename().endsWith(".xls") || file.getOriginalFilename().endsWith(".xlsx"))
		{
			try{
				return new ResponseEntity<ImportSummary>(stockpriceService.addStockPricesFromExcelSheet(file), HttpStatus.OK);
			}
			catch(IOException e){
				e.printStackTrace();
				return new ResponseEntity<String>("Error Reading the file", HttpStatus.BAD_REQUEST);
			}
			catch(Exception e){
				e.printStackTrace();
				return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}
		else {	
			    return new ResponseEntity<String>("Wrong file extension. The file should be .xls or an .xlsx file.", HttpStatus.BAD_REQUEST);
			 }
		}
		
	}
	


