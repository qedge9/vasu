package com.selenium.practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLoginTest 
{

	public static void main(String[] args) throws Exception
	{
		
		//appLaunch
		String  username="Admin";//excel
		
		String password="Admin";
		
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://primusbank.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//validation
		
		if(driver.findElement(By.id("txtuId")).isDisplayed())
		{
			System.out.println("AppLaunch Successfully");
		}else
		{
			System.out.println("AppLaunch Failed");
		}
		
		
		//appLogin
		
		driver.findElement(By.id("txtuId")).sendKeys(username);
		
		driver.findElement(By.id("txtPword")).sendKeys(password);
		
		driver.findElement(By.id("login")).click();
		//Validation
		
		if(driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			System.out.println("AppLogin Successfully");
		}else
		{
			System.out.println("AppLogin Failed");
		}
		
		//appLogout
		
		//validation
		
		
		//appClose
		
		
		
		
		
		
		
		
		

	}

}
