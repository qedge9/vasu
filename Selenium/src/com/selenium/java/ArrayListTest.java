package com.selenium.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest 
{

	public static void main(String[] args) 
	{
		
		
		//ArrayList<String> l=new ArrayList<>();
		
		/*List<String> l=new ArrayList<>();
		
		l.add("Selenium");
		l.add("Vasu");
		l.add("uft");
		l.add("Selenium");
		
		System.out.println(l.size());
		
		for (int i = 0; i < l.size(); i++)
		{
			System.out.println(l.get(i));
		}*/
		List<Object> l=new ArrayList<>();
		
		l.add(14);
		l.add(15);
		l.add(12.25);
		l.add('V');//char
		l.add("Selenium");//String  
		
		System.out.println(l.size());
		
		for (int i = 0; i < l.size(); i++)
		{
			System.out.println(l.get(i));
		}

	}

}
