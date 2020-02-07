package com.cts.training.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin= new FileInputStream("./details.properties");
 Properties properties= System.getProperties();
//		properties.load(fin);
//		System.out.println("username: " +properties.getProperty("username"));
//		properties.put(1, "Cognizant");
//		properties.put(2, "Arich");
//		System.out.println(properties);
		
		Set<Map.Entry<Object, Object>> set= properties.entrySet();
		for(Map.Entry<Object, Object> e:set)
		{
			System.out.println(e);
		}
		
	
		
		
		
	}
}

