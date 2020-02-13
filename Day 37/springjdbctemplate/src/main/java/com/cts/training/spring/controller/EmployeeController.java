package com.cts.training.spring.controller;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.spring.springjdbctemplate.Employee;
import com.cts.training.spring.springjdbctemplateDao.EmployeeDao;

public class EmployeeController {
	public static void main(String args[]) throws IOException
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("./beans.xml");
		EmployeeDao employeeDao= (EmployeeDao)context.getBean("employeeDaoImpl");
		
		
		//Employee employee = new Employee(2,"Harry", "gryf@com","St no. 2", 989231L);
		//System.out.println(employeeDao.addEmployee(employee));   
		//System.out.println(employeeDao.deleteEmployee(employee));
		
		System.out.println(employeeDao.getEmployeeById(2));
		
	}
	

}
