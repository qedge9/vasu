package com.selenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmpReg
{

	@FindBy(linkText="PIM")
	WebElement pim;
	

	@FindBy(linkText="Add Employee")
	WebElement addemp;
	
	@FindBy(id="firstName")
	WebElement fname;
	
	@FindBy(id="lastName")
	WebElement lname;
	
	@FindBy(id="btnSave")
	WebElement save;
	
	//method
	
	public void empcreation()
	{
		pim.click();
		
		addemp.click();
		
		fname.sendKeys("Vasudeva");
		
		lname.sendKeys("selenium");
		
		save.click();
		
		
	}
	
}
