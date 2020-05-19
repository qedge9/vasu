package com.selenium.pb;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM 
{
	ChromeDriver driver;
	String res;
	public String applaunch(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ExecutableFile\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	//validate
	if(driver.findElement(By.id("txtUsername")).isDisplayed())
	{
	res="pass";
	}
	else
	{
	res="fail";
	}
	return res;
	}
	//applogin
	public String applogin(String username,String password)
	{
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.id("btnLogin")).click();
	//validation
	if(driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).isDisplayed())
	{
	res="pass";
	}
	else
	{
	res="fail";
	}
	return res;
	}
	
	public String empCreation(String fName,String lName) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys(fName);
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("btnSave")).click();
		
		
		//validation
		
		if (driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		
		return res;
	}
	//applogout
	public String applogout() throws Exception
	{
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	//validation
	if(driver.findElement(By.id("txtUsername")).isDisplayed())
	{
	res="pass";
	}
	else
	{
	res="fail";
	}
	return res;
	}
	public void appclose()
	{
	driver.close();
	    }
}
