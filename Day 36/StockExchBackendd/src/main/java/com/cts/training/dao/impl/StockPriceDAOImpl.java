package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.cts.training.dao.StockPriceDAO;
import com.cts.training.model.Register;
import com.cts.training.model.StockPrice;


public class StockPriceDAOImpl implements StockPriceDAO {

	@Autowired
	SessionFactory sessionFactory;

	
	public boolean addStockPrice(StockPrice stockPrice) {
		
		try {
			
			sessionFactory.getCurrentSession().save(stockPrice);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateStockPrice(StockPrice stockPrice) {
		try {
			sessionFactory.getCurrentSession().update(stockPrice);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteStockPrice(StockPrice stockPrice) {
		try {
			
			sessionFactory.getCurrentSession().delete(stockPrice);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public StockPrice getStockPriceById(int id) {
		try {
			
			return sessionFactory.getCurrentSession().get(StockPrice.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<StockPrice> getAllStockPrices() {
		try {
			
			
			List<StockPrice> stockPrices = sessionFactory.getCurrentSession().createQuery("FROM StockPrice").list();
			
			return stockPrices;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}