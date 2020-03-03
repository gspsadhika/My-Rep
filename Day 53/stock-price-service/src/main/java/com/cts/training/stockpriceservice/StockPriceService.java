package com.cts.training.stockpriceservice;

import java.util.List;


public interface StockPriceService {
	public StockPrice insert(StockPrice stockprice);
	public StockPrice update(StockPrice stockprice);
	public void delete(int id);
	public StockPrice getElementById(int id);
	public List<StockPrice> getAllPrices();
	

}
