package com.cts.training.spring.springjdbctemplateDao;

import java.util.List;

import com.cts.training.spring.springjdbctemplate.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee employee);
	//public boolean saveEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();

}
