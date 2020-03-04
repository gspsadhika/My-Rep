package com.cts.training.stockexchangeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockExchangeServiceImpl implements StockExchangeService{
	@Autowired
	StockExchangeRepo stockexchangeRepo;
	

	@Override
	public StockExchange insert(StockExchange stockexchange) {
		StockExchange stockex= stockexchangeRepo.save(stockexchange);
		return stockex;
	}


	@Override
	public StockExchange update(StockExchange stockexchange) {
		StockExchange stockex = stockexchangeRepo.save(stockexchange);
		return stockex;
	}


	@Override
	public StockExchange getElementById(int id) {
		Optional<StockExchange> stockexchange= stockexchangeRepo.findById(id);
		StockExchange stockex = stockexchange.get();
		return stockex;
	}


	@Override
	public List<StockExchange> getAllStockExchanges() {

		return stockexchangeRepo.findAll();
	}


	@Override
	public void delete(int id) {
		stockexchangeRepo.deleteById(id);
		
	}
	

}
