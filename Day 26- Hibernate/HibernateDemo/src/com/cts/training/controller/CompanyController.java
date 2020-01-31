package com.cts.training.controller;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Company;
import com.cts.training.model.StockExchange;

public class CompanyController {
	public static void main(String args[])
	{
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		Company company= new Company(101, "CTS", "Digital Transformation", "Brian Humpries", 89898909.989);
//		session.save(company);		
		
		StockExchange se= new StockExchange(064, "BSE", "Mumbai", "Mutual Funds");
		session.save(se);
		transaction.commit();
		session.close();
		
	}

}
