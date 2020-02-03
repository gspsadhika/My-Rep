package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.ContractualEmployee;
import com.cts.training.model.Employee;
import com.cts.training.model.PermanentEmployee;



public class EmployeeController {
public static void main(String args[])
{
	Configuration cfg= new Configuration();
	cfg.configure();
	SessionFactory sessionFactory= cfg.buildSessionFactory();
	Session session =sessionFactory.openSession();
	Transaction tx= session.beginTransaction();
	
	Employee employee= new Employee();
	employee.setName("Malavika Unni");
	
	PermanentEmployee pe= new PermanentEmployee();	
	pe.setName("Sadhika Gorti");
	pe.setSalary(32432);
	pe.setBonus(78292F);
	
	ContractualEmployee ce = new ContractualEmployee();
	ce.setName("Shivani");
	ce.setPayperHour(2000);
	ce.setContractPeriod(12);
	
	session.save(employee);
	session.save(pe);
	session.save(ce);
	
	tx.commit();
	session.close();
}
}

