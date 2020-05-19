package com.selenium.excel;

import com.selenium.pb.OHRM;

public class AssignmentTest 
{

	public static void main(String[] args) throws Exception 
	{
		OHRM app=new OHRM();
		
		app.applaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
		app.applogin("Admin", "Qedge123!@#");
		
		app.empCreation("Vasu789", "sel789");
		
		app.applogout();
		
		app.appclose();

	}

}
