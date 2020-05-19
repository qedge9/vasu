package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTest
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		//Identify  all links present on newtours web pagw

		
		List<WebElement>  links=driver.findElements(By.tagName("a"));
		
		
		System.out.println(links.size());//16
		
		
		//capture all the link names
		
		/*for (int i = 0; i < links.size(); i++)
		{
			System.out.println(i+"  "+links.get(i).getText());
		}*/
		
		//click on specific links
		
		for (int i = 0; i < links.size(); i++)
		{
			if(links.get(i).getText().equals("REGISTER"))
			{
				links.get(i).click();
			}
			
			
		}
		
	}

}
