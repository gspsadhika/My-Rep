package com.cts.training.stockexchangeservice;

import java.util.List;


public interface StockExchangeService {
	public StockExchange insert(StockExchange stockexchange);
	public StockExchange update(StockExchange stockexchange);
	public void delete(int id);
	public StockExchange getElementById(int id);
	public List<StockExchange> getAllStockExchanges();
}
