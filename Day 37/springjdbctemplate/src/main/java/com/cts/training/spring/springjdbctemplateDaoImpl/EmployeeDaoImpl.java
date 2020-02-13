package com.cts.training.spring.springjdbctemplateDaoImpl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.spring.springjdbctemplate.Employee;
import com.cts.training.spring.springjdbctemplateDao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate= jdbcTemplate;
	}
	
	public boolean addEmployee(Employee employee)
	{
		String query= "insert into Employee values(?,?,?,?,?)";
		try
		{
			    jdbcTemplate.update(query, 
			    		employee.getId(), 
			    		employee.getName(), 
			    		employee.getAddress(), 
			    		employee.getEmail(),
			    		employee.getMobile());
		return true;
		} 
		catch(DataAccessException e) 
		{
			e.printStackTrace();
			return false;
			}
	}
	public boolean deleteEmployee(Employee employee)
	{
		String query="delete from Employee where id= ?";
		try
		{
			jdbcTemplate.update(query, employee.getId());
			return true;
		}
		catch(DataAccessException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
//	public boolean saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
//		return false;
//	}
	public boolean updateEmployee(Employee employee) {
		String query= "update employee set name=?, address=?,email=?,mobile=? where id =?";
		try{
			jdbcTemplate.update(query, employee.getName(), 
					employee.getAddress(),
					employee.getEmail(),
					employee.getMobile(), 
					employee.getId());
			
			return true;
			} 
		catch(DataAccessException e) 
		{
			e.printStackTrace();
		}

		return false;
	}
	
	public Employee getEmployeeById(int id) 
	{
		String query = "select * from Employee where id = ?";
		RowMapper<Employee> rowMapper= new BeanPropertyRowMapper<Employee>(Employee.class);
		return jdbcTemplate.queryForObject(query, rowMapper, id);		
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
}
