package com.selenium.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest
{

	public static void main(String[] args) throws Exception 
	{
		
		
		/*FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		
		*/
		//handling html alerts/popups
		
		
		//driver.findElement(By.xpath("//*[@id='parentdiv']/img")).click();
		
		//Handling Java Script alerts
		
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.get("Http://Primusbank.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();//click ok
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
