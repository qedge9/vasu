package com.selenium.nsm;

public class Method3
{

	//method with-out return type with parameters
	
			public void add(int a ,int b)
			{
				
				int sum = a+b;
				
				System.out.println(sum);
				
				
			}
	public static void main(String[] args) 
	{
		//calling a method with method name , it won't return a vale
		Method3 ns=new Method3();
		
		ns.add(20, 30);
	}

}
