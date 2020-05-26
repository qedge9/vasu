package com.selenium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{

	@FindBy(id="txtUsername")
	WebElement userName; //object
	
	@FindBy(id="txtPassword")
	WebElement password; //object
	
	
	@FindBy(id="btnLogin")
	WebElement login; //object
	
	//method for adminlogin(test case)
	
	public void adminLogin(String username,String pwd)
	{
		userName.sendKeys(username);
		password.sendKeys(pwd);
		login.click();
		
		
	}
	
	
	
}
