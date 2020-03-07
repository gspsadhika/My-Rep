package com.cts.training.stockpriceservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	StockPriceRepo stockpriceRepo;
	
	@Override
	public StockPrice addStockPrice(StockPrice stockprice) {
		stockpriceRepo.save(stockprice);
		return stockprice;
	}

	@Override
	public StockPrice updateStockPrice(StockPrice stockprice) {
		stockpriceRepo.save(stockprice);
		return stockprice;
		
	}

	@Override
	public void deleteStockPrice(int id) {
	stockpriceRepo.deleteById(id);
		
	}

	@Override
	public StockPrice getStockPriceById(int id) {
		Optional<StockPrice> stockprices= stockpriceRepo.findById(id);
		StockPrice stockprice = new StockPrice();
		BeanUtils.copyProperties(stockprices.orElse(new StockPrice()), stockprice);
		return stockprice;
	}

	@Override
	public List<StockPrice> getAllStockPrices() {
		List<StockPrice> entities = stockpriceRepo.findAll();
		List<StockPrice> stockprices = new ArrayList<StockPrice>();
		for(StockPrice entity: entities) {
			StockPrice stockprice = new StockPrice();
			BeanUtils.copyProperties(entity, stockprice);
			stockprices.add(stockprice);
		}
		System.out.println("Entity: "+entities);
		System.out.println("DTO: "+stockprices);
		return stockprices;
	}
	}


