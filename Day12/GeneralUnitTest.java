package com.cts.test;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneralUnitTest {
static GeneralAPI api=null;
@BeforeClass
public static void start()
{
	api= new GeneralAPI();
	System.out.println("General API Object Created");
}
@AfterClass
public static void destory()
{
	api=null;
	System.out.println("API Object Destroyed");
}
@Test //works as test case
public void testAddNumbers()
{
	assertEquals(12, api.add(4,8));
}
public void testCheckForEven()
{
	assertEquals(true, api.checkEven(12));
	
}
@Test
public void testFactorialNumber()
{
	assertEquals(120, api.getFactorial(5));
}

	
}

