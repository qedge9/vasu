package com.selenium.java;

import com.selenium.nsm.Method1;

public class Vasu 
{
//variables
	
	int i=40;
	
	//methods
	
	public void add()
	{
		// Program to perform addition of two numbers
		
				int a=10;
				
				int b=20;
				
				int sum=a+b;
				
				System.out.println(sum);	
	}
	
	
	public static void main(String[] args)
	{
		// object
		
		Method1 ns=new Method1();
		
		int res=ns.add(20, 30);
		
		System.out.println(res);
	}

}
