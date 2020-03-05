package com.cts.training.sectorservice;

import java.util.List;

public interface SectorService {
public Sector insert (Sector sector);
public Sector update (Sector sector);
public void delete(int id);
public Sector getElementById(int id);
public List<Sector> getAllSectors();
}
