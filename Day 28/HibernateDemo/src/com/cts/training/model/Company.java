package com.cts.training.model;

import java.io.Serializable;

public class Company implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8096847845658268132L;
	private int id;
	private String name;
	private String sector;
	private String cooName;
	private double turnOver;
	
	public Company(int id, String name, String sector, String cooName, double d) {
		super();
		this.id = id;
		this.name = name;
		this.sector = sector;
		this.cooName = cooName;
		this.turnOver = d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCooName() {
		return cooName;
	}
	public void setCooName(String cooName) {
		this.cooName = cooName;
	}
	public double getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}
}