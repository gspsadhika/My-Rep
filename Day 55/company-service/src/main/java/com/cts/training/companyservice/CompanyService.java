package com.cts.training.companyservice;


import java.util.List;


public interface CompanyService {
	public Company insert(Company company);
	public Company update(Company company);
	public void delete(int id);
	public Company getElementById(int id);
	public List<Company> getAllCompanies();
		 
}
