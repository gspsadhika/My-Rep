package com.cts.training.userservice;

import java.util.List;


public interface RegisterService {
	public RegisterDTO insert(RegisterDTO rd);
	public RegisterDTO update(RegisterDTO rd);
	public void delete(int id);
	public RegisterDTO getElementById(int id);
	public List<RegisterDTO> getAllUsers();

}
