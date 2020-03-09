package com.cts.training.stockpriceservice;

import java.util.List;


public interface StockPriceService {
	public StockPrice addStockPrice(StockPrice stockprice);
	public StockPrice updateStockPrice(StockPrice stockprice);
	public void deleteStockPrice(int id);
	public StockPrice getStockPriceById(int id);
	public List<StockPrice> getAllStockPrices();
	

}
