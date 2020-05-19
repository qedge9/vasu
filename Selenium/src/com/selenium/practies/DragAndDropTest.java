package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//finding the frames count by using tagname
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());
		
		
		//give the control to the specific frame
		
		//1. based on Index
		
		//driver.switchTo().frame(0);
		
		//2. Based on String(xpath)
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		
		//3.Based on WebElement
		
		WebElement fram1=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		
		driver.switchTo().frame(fram1);
		
		WebElement drg=driver.findElement(By.id("draggable"));
		
		WebElement drp=driver.findElement(By.id("droppable"));
		
		
		Actions dAd=new Actions(driver);
		
		dAd.dragAndDrop(drg, drp).build().perform();
		
		//giving the control to previous html document 
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/h1")).getText());
		
		
		
		
		
		
		
		
		
		

	}

}
