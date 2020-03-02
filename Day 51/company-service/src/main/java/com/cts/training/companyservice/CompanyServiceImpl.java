package com.cts.training.companyservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

 class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyRepo companyRepo;
	

	@Override
	public Company insert(Company company) {
		return company;
	
	}


	@Override
	public Company update(Company cd) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Company getElementById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Company> getAllCompanies() {
		// TODO Auto-generated method stub
		return null;
	}
}
		