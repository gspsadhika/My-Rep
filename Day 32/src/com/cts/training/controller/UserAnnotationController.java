
//This is a java configuration example. We used annotation.
package com.cts.training.controller;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.model.UserEntity;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;

public class UserAnnotationController {
	
public static void main(String args[]) {
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.scan("com.cts.training");
    context.refresh();
    
    UserEntity userEntity= (UserEntity)context.getBean("userEntity");
    List<String> emails= new ArrayList<String>(Arrays.asList("admin@cts.com", "admin@gmail.com", "adming@ht.com"));
   
    userEntity.setEmail(emails);
    System.out.println(userEntity.getEmail());
	
	
}

}
