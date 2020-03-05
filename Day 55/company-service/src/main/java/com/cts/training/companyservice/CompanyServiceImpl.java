package com.cts.training.companyservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	CompanyRepo companyRepo;
	

	@Override
	public Company insert(Company company) {
		Company comp= companyRepo.save(company);
		return comp;
	}


	@Override
	public Company update(Company company) {
		Company comp= companyRepo.save(company);
		return comp;		
	}


	@Override
	public void delete(int id) {
	companyRepo.deleteById(id);
	}


	@Override
	public Company getElementById(int id) {
		Optional<Company> comp= companyRepo.findById(id);
		Company company = comp.get();
		return company;
	}


	@Override
	public List<Company> getAllCompanies() {
		return companyRepo.findAll();
	}
}
		