package com.selenium.testng;

import org.testng.annotations.Test;

public class MultipleTestNgTest 
{

	
	@Test(priority=1)
	public void appLaunch()
	{
		System.out.println("appLaunch");
	}
	@Test(priority=2) //Test Case // Class
	public void appLogin()
	{
		System.out.println("appLogin");
	}
	@Test //Test Case // Class
	public void appLogout()
	{
		System.out.println("appLogout");
	}
	
	@Test //Test Case // Class
	public void appClose()
	{
		System.out.println("appClose");
	}
}
