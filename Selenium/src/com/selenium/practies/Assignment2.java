package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2
{

	public static void main(String[] args) throws Exception
	{

		FirefoxDriver driver=new FirefoxDriver();

		driver.get("https://www.quikr.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("searchedCat")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='category-dropdown']/ul/li/a"));

				System.out.println(list.size());
				
				for (int i = 0; i < list.size(); i++)
				{
					System.out.println(list.get(i).getText());
				}
	}

}
