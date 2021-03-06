package com.cts.training.stockpriceservice;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


public interface StockPriceService {
	public StockPrice addStockPrice(StockPrice stockprice);
	public StockPrice updateStockPrice(StockPrice stockprice);
	public void deleteStockPrice(int id);
	public StockPrice getStockPriceById(int id);
	public List<StockPrice> getAllStockPrices();
	public ImportSummary addStockPricesFromExcelSheet(MultipartFile file) throws Exception;
	
	

}
