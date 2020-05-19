package com.selenium.sm;

public class Method1 
{

	//static method with return type with parameters
	
		public static int add(int a,int b)
		{
			
			int sum = a+b;
			
			//return-type
			
			return sum;
			
			
			
		}
		
	public static void main(String[] args) 
	{
		// calling static methods
		
		//no need to create object ref
		
		//syntax: className.methodname
		
		
		int res=Method1.add(20, 10);
		
		System.out.println(res);

	}

}
