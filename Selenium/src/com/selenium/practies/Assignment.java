package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{

	public static void main(String[] args) 
	{
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		//Day dropdown
		
		Select day=new Select(driver.findElement(By.id("day")));
		
		day.selectByIndex(5);
		
		//Month dropdown
		
		Select month=new Select(driver.findElement(By.id("month")));
		
		month.selectByIndex(5);
		
		//Year dropdown
		
		Select year=new Select(driver.findElement(By.id("year")));
		
		year.selectByIndex(5);


	}

}
