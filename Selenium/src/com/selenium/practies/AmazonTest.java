package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest 
{

	public static void main(String[] args) throws Exception
	{
		String expTitle="Amazon.in: Harry Potter";
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.navigate().to("Http://Amazon.in");
		
		driver.manage().window().maximize();
		//Identify search box Enter harry potter text in search box
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		//Identify search button and click on it
		
		driver.findElement(By.className("nav-input")).click();
		

		Thread.sleep(2000);
		String actTitle=driver.getTitle();
		
		System.out.println(actTitle);
		
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		

	}

}
