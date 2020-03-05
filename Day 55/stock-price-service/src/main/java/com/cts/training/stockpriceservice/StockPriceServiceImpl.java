package com.cts.training.stockpriceservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	StockPriceRepo stockpriceRepo;
	
	@Override
	public StockPrice insert(StockPrice stockprice) {
		StockPrice stockpr= stockpriceRepo.save(stockprice);
		return stockpr;
	}

	@Override
	public StockPrice update(StockPrice stockprice) {
		StockPrice stockpr = stockpriceRepo.save(stockprice);
		return stockpr;
		
	}

	@Override
	public void delete(int id) {
	stockpriceRepo.deleteById(id);
		
	}

	@Override
	public StockPrice getElementById(int id) {
		Optional<StockPrice> stockpr= stockpriceRepo.findById(id);
		StockPrice stockprice = stockpr.get();
		return stockprice;
	}

	@Override
	public List<StockPrice> getAllPrices() {
		return stockpriceRepo.findAll();
	}

}
