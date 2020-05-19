package com.selenium.nsm;

public class Method2 
{

	//method with return type with-Out parameters
	
		public int add()
		{
			int a=40;
			int b=50;
			int sum = a+b;
			
			//return-type
			
			return sum;
			
			
			
		}
	public static void main(String[] args)
	{
		Method2 ns=new Method2();
		
		int res=ns.add();
		System.out.println(res);
	}

}
