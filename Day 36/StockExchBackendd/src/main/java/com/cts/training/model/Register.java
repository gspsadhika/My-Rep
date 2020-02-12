package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
 @Table(name= "Register") 
@Component
public class Register implements Serializable{

	private static final long serialVersionUID = -8087800141201379851L;
	@Id
//	@GeneratedValue
	private int id;
	private String fname;
	private String lname;
	private String uname;
	private String email;
	private String rpwd;
	private String repwd;
	private long phone;
	private int otp; 
   public  Register(){
		
	}
	public Register(int id, String fname, String lname, String uname, String email, String rpwd, String repwd,
			long phone, int otp) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.email = email;
		this.rpwd = rpwd;
		this.repwd = repwd;
		this.phone = phone;
		this.otp = otp;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRpwd() {
		return rpwd;
	}
	public void setRpwd(String rpwd) {
		this.rpwd = rpwd;
	}
	public String getRepwd() {
		return repwd;
	}
	public void setRepwd(String repwd) {
		this.repwd = repwd;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", fname=" + fname + ", lname=" + lname + ", uname=" + uname + ", email=" + email
				+ ", rpwd=" + rpwd + ", repwd=" + repwd + ", phone=" + phone + ", otp=" + otp + "]";
	}
	
	
	

}