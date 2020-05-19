package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest 
{

	public static void main(String[] args) 
	{
		
		String expTitle="Gmail";
		// Open FF Browser navigate to google,maximize window  and then click on Gmail
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.navigate().to("Http://Google.co.in");
		
		driver.manage().window().maximize();
		
		//Identify the gmail (element) and click 
		
		//driver.findElement(By.className("gb_g")).click();
		driver.findElement(By.linkText("Gmail")).click();
		
		//validation
		
		/*String actTitle=driver.getTitle();
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("link is working");
		}else
		{
			System.out.println("link is not working");
		}*/
		
		
		if(driver.findElement(By.id("identifierId")).isDisplayed())//true/false
		{
			System.out.println("Link is working");
		}else
		{
			System.out.println("Link is Not working");
		}
		
		
		
		
		
		
		

	}

}
