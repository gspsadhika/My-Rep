package com.cts.training.model;

public class User {
private int id;
private String name;
private String password;
private String email;
private long phone;
private boolean enabled;

public User()
{
super();
}

public User(int id, String name, String password, String email, long phone, boolean enabled) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.email = email;
	this.phone = phone;
	this.enabled = enabled;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", phone=" + phone
			+ ", enabled=" + enabled + "]";
}

}
