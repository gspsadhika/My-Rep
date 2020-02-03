package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.cts.training.model.Actor;
import com.cts.training.model.Movie;

public class MovController 
{
	public static void main(String args[])
	{
		
	Configuration cfg= new Configuration();
	cfg.configure();
	SessionFactory sessionFactory= cfg.buildSessionFactory();
	Session session= sessionFactory.openSession();
	
    
	Movie movie = new Movie();
	movie.setName("Kal Ho na Ho");
	
	Actor actor1 = new Actor();
	actor1.setActorName("SRK");
	actor1.setMovie(movie);
	
	Actor actor2 = new Actor();
	actor2.setActorName("Priety");
	actor2.setMovie(movie);
	
	Transaction tx= session.getTransaction();
	tx.begin();
	session.save(movie);
	session.save(actor1);
	session.save(actor2);
	tx.commit();
	session.close();
	
}
}

