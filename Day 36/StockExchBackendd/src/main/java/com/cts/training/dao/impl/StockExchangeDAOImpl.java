package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.Register;
import com.cts.training.model.StockExchange;


public class StockExchangeDAOImpl implements StockExchangeDAO {
	@Autowired
	SessionFactory sessionFactory;

	public boolean addStockExchange(StockExchange stockExchange) {
		
		try {
			sessionFactory.getCurrentSession().save(stockExchange);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean updateStockExchange(StockExchange stockExchange) {
		try {
			sessionFactory.getCurrentSession().update(stockExchange);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean deleteStockExchange(StockExchange stockExchange) {
		try {
			sessionFactory.getCurrentSession().delete(stockExchange);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public StockExchange getStockExchangeById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(StockExchange.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	

	public List<StockExchange> getAllStockExchanges() {
		try {
			
			List<StockExchange> stockExchanges = sessionFactory.getCurrentSession().createQuery("from StockExchange").list();
			
			return stockExchanges;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}


}
