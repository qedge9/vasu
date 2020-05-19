package com.selenium.testng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpAdd extends OHRM
{

	
	@Test(dataProvider="getData")
	public void empAdd(String fName,String lName) throws Exception
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
	}
	
	
	@DataProvider
	public Object [][] getData()
	{
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="Vasudeva1";
		
		data[0][1]="Selenium1";
		data[1][0]="Vasudeva2";
		
		data[1][1]="Selenium2";
		
		return data;
		
	}
}
