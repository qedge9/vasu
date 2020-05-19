package com.selenium.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ExecutableFile\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Set<String> windows=driver.getWindowHandles();
		
		//Iterator<String> it=windows.iterator();
		
	//	while(it.hasNext())
	//	{
			//capturing all the window id's
			
			//System.out.println(it.next().toString());
			
			//capture window title and close it
			
			//give the control to one by one window
			
			//driver.switchTo().window(it.next().toString());
			
			//capture the title
			//System.out.println(driver.getTitle());
			
			//close
			
			//driver.close();
			
			//closing all the windows except amazon(specific one)
			
			//if (!driver.getTitle().equals("Amazon")) 
			//{
			//	driver.close();
			//}
			
			
			//		}
		List<String> tabs=new ArrayList(windows);
		
		driver.switchTo().window(tabs.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.close();

		driver.switchTo().window(tabs.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
