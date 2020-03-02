package com.cts.training.userservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface RegisterRepo extends JpaRepository<Register, Integer>
{
	Register findByEmail(String email);
}
