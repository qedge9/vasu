package com.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLoginTest 
{

	@Test
	public void adminLogin()
	{
String  username="Admin";//excel
		
		String password="Admin";
		
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://primusbank.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtuId")).sendKeys(username);
		
		driver.findElement(By.id("txtPword")).sendKeys(password);
		
		driver.findElement(By.id("login")).click();
	}

}
