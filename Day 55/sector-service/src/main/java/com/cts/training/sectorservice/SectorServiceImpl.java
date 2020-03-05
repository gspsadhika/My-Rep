package com.cts.training.sectorservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;



public class SectorServiceImpl implements SectorService {

	@Autowired
	SectorRepo sectorRepo;
	
	@Override
	public Sector insert(Sector sector) {
		Sector sec= sectorRepo.save(sector);
		return sec;
	}

	@Override
	public Sector update(Sector sector) {
	    Sector sec= sectorRepo.save(sector);
		return sec;
	}

	@Override
	public void delete(int id) {
		sectorRepo.deleteById(id);
		
	}

	@Override
	public Sector getElementById(int id) {
		Optional<Sector> sec= sectorRepo.findById(id);
		Sector sector=sec.get();
		return sector;
	}

	@Override
	public List<Sector> getAllSectors() {
	
		return sectorRepo.findAll();
		
	}

}
