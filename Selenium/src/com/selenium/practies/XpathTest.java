package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("src")).sendKeys("H");
		
		Thread.sleep(3000);
		
		List<WebElement> cities=driver.findElements(By.xpath("//*[@id='search']/div/div[1]/div/ul/li"));
		
System.out.println(cities.size());

for (int i = 0; i < cities.size(); i++)
{
	System.out.println(cities.get(i).getText());
}
	}

}
