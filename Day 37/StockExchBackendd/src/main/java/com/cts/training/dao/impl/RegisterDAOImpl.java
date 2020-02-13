package com.cts.training.dao.impl;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cts.training.dao.RegisterDAO;
import com.cts.training.model.Register;

@Transactional
@Repository(value = "registerDAO")
public class RegisterDAOImpl implements RegisterDAO {
	@Autowired
	SessionFactory sessionFactory;
	
//	public boolean saveUser(Register register) {
//		try {
//			sessionFactory.getCurrentSession().save(register);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
	public boolean saveorUpdateUser(Register register) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(register);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean deleteUser(Register register) {
		try {
			sessionFactory.getCurrentSession().delete(register);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	public Register getUserById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Register.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	public List<Register> getAllUsers() {
		try {
			return sessionFactory.getCurrentSession().createQuery("FROM Register").list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}

