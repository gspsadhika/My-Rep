package com.cts.training.initialpublicofferingservice;

import java.util.List;

public interface IPOService {
	
	public IPO insert(IPO ipo);
	public IPO update(IPO ipo);
	public void delete(int id);
	public IPO getElementById(int id);
	public List<IPO> getAllIpos();
		 

}
