package com.cts.training.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cts.training.model.UserEntity;

public class UserController {
	public static void main(String args[])
	{
//BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("beans.xml"));
//UserEntity entity= (UserEntity) beanFactory.getBean("user");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserEntity entity= (UserEntity)context.getBean("user");
		System.out.println("email is: " +entity.getEmail());

}
}