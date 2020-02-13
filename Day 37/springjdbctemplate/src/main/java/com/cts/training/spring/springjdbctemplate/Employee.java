package com.cts.training.spring.springjdbctemplate;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String address;
	private long mobile;
	
	public Employee(int id, String name, String email, String address, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", mobile="
				+ mobile + "]";
	}
	

}
