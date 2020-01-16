package com.cts.test;

public class GeneralAPI 
{
	public int add(int a , int b)
	{
		return a+b;
	}
public boolean checkEven(int num)
{
	if(num%2==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public int getFactorial(int num)
{
	
	return num==1 ? 1:num*getFactorial(num-1);
}

}
