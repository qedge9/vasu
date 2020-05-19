package com.selenium.nsm;

public class Method1

{

	//method with return type with parameters
	
	public int add(int a,int b)
	{
		
		int sum = a+b;
		
		//return-type
		
		return sum;
		
		
		
	}
	
	public static void main(String[] args)
	{
		
		Method1 ns=new Method1();
		
		//calling a method with method name , it won't return a vale
		//ns.add(20, 20);
		
		//calling a method with a variable , it will return a value
		
		int res=ns.add(20, 30);
		
		System.out.println(res);
		
		
		
		
		

	}

}
