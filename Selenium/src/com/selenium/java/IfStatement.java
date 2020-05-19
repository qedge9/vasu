package com.selenium.java;

import java.util.Scanner;

public class IfStatement 
{

	public static void main(String[] args) 
	{
		// TO check the given no is "Even" / "Odd"
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		//int n=44;
		
		if(n%2==0)
		{
			System.out.println("Even Number ");
		}else
		{
			System.out.println("Odd Number");
		}
		
		

	}

}
