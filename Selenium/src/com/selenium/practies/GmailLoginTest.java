package com.selenium.practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\ExecutableFile\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("Http://Gmail.com");
		
		driver.manage().window().maximize();
		//wait 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("identifierId")).sendKeys("vasu@qedgetech.com");
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
		
		driver.findElement(By.name("password")).sendKeys("Qedge");
		
		driver.findElement(By.xpath("//*[@id='passwordNext']/span")).click();

		
	}

}
