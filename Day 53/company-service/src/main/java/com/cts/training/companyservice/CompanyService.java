package com.cts.training.companyservice;


import java.util.List;


public interface CompanyService {
	public Company insert(Company cd);
	public Company update(Company cd);
	public void delete(int id);
	public Company getElementById(int id);
	public List<Company> getAllCompanies();
		 
}
