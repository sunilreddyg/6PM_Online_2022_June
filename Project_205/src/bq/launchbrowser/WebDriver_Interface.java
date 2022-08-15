package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * WebDriver is a interface class, It can implement
		 * all browser instance supported by selenium.
		 * 
		 * WebDriver interface support cross browser automation
		 * without duplicating automation code for each and ever browser..
		 */
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();     //Opening chrome browser
		driver.get("http://facebook.com");       //Loading a new page to browser window
		driver.manage().window().maximize();	 //maximizing browser window
		driver.close();
		
		/*
		 * Exceptions:-->
		 * 			
		 * 		IllegalStateException:-->
		 * 				When environment path not setup for chromedriver
		 * 								OR
		 * 				Path defined wrong
		 * 
		 * 		NoSessionCreated:-->
		 * 				When you browser version mismatch with browser driver version
		 * 				[when you get this message upgrade browser version]
		 * 
		 * 		INvalidArgument Exception:-->
		 * 				when site url is not defined with http://  or https:// protocals
		 * 
		 */
		

	}

}
