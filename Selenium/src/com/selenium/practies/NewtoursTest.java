package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewtoursTest 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("QedgeTech");
		
		
		driver.findElement(By.name("phone")).sendKeys("555555555");
		

	}

}
