package com.cts.training.initialpublicofferingservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IPOServiceImpl implements IPOService {
	@Autowired
	IPORepo ipoRepo;
	

	@Override
	public IPO insert(IPO ipo) {
		IPO ipo1= ipoRepo.save(ipo);
		return ipo1;
	}


	@Override
	public IPO update(IPO ipo) {
		IPO ipo1= ipoRepo.save(ipo);
		return ipo1;
	}


	@Override
	public IPO getElementById(int id) {
		Optional<IPO> ipo= ipoRepo.findById(id);
		IPO ipo1 = ipo.get();
		return ipo1;
	}


	@Override
	public List<IPO> getAllIpos() {

		return ipoRepo.findAll();
	}


	@Override
	public void delete(int id) {
		ipoRepo.deleteById(id);
		
	}
}


