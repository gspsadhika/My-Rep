package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;

import com.cts.training.dao.RegisterDAO;
import com.cts.training.dao.impl.RegisterDAOImpl;
import com.cts.training.model.Register;

public class RegisterUnitTest {
	private static AnnotationConfigApplicationContext context;
	private static RegisterDAO registerDAO;
	private static Register register;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		register = (Register) context.getBean("register");

		registerDAO = (RegisterDAO) context.getBean("registerDAO");

	}

	/*
	 * @Test public void testGetALLUsers() { List<Register> users =
	 * registerDAO.getAllUsers(); assertEquals(4, users.size()); }
	 */

	/*
	 * @Test public void test_update_user_success() { Register r =
	 * registerDAO.getUserById(101); r.setUname("sindhu123"); assertEquals(true,
	 * registerDAO.updateUser(r)); }
	 */

	/*
	 * @Test(expected = NullPointerException.class) public void
	 * test_get_user_by_id_fail() { Register r = registerDAO.getUserById(43);
	 * assertEquals("sravya", r.getFname()); }
	 */

	/*
	 * @Test public void test_save_user_success() { Register reg = new
	 * Register(102,"chandu","Tallapaneni","chandu123","chandu@gmail.com","154321",
	 * "154321",63784623L,4352);
	 * 
	 * assertEquals(true, registerDAO.saveUser(reg)); }
	 */

	
	  @Test(expected = DataIntegrityViolationException.class) 
	  public void test_save_user_failed() { Register reg = new
	  Register(48,"chandu","Tallapaneni","chandu123","chandu@gmail.com","154321",
	  "154321",63784623L,4352); assertEquals(true, registerDAO.saveUser(reg)); }
	 

	/*
	 * @Test public void test_delete_user() { Register r =
	 * registerDAO.getUserById(45); assertEquals(true, registerDAO.deleteUser(r));
	 * 
	 * }
	 */

	/*
	 * @Test(expected = IllegalArgumentException.class) public void
	 * test_delete_user_fail() { Register r = registerDAO.getUserById(46);
	 * assertEquals(true, registerDAO.deleteUser(r));
	 * 
	 * }
	 */

}