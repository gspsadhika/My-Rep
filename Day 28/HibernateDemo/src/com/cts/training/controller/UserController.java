package com.cts.training.controller;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.User;

public class UserController { 
	public static void main(String args[])
	{
		Configuration cfg= new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
//        User user= new User(102, "Meghna", "Matrusri", "megh@gmail.com", 94555, true);
//        User getUser= session.get(User.class,102);
//		getUser.setPassword("rollno19");
//        session.updatePassword("rollno19");
//		session.delete(getUser);
   
		transaction.commit();
		session.close();
	}
}