package com.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest 
{

	
	@Test(dataProvider="getData")
	public void adminLogin(String username,String password)
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://primusbank.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtuId")).sendKeys(username);
		
		driver.findElement(By.id("txtPword")).sendKeys(password);
		
		driver.findElement(By.id("login")).click();
	}
	
	
	@DataProvider
	public Object [][] getData()
	{
		
		Object[][] data=new Object[1][2];
		
		data[0][0]="Admin";
		
		data[0][1]="Admin";
		
		
		return data;
		
	}

}
