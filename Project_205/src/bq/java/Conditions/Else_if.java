package bq.java.Conditions;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Else_if {

	public static void main(String[] args) 
	{
		
		/*
		 * Else-if
		 * Multiple Decision statements take place here
		 */
		
		
		String browser="ie";
		
		
		if(browser.equals("chrome"))
		{
			System.out.println("Chrome browse is launched");
		}
		else if (browser.equals("firefox")) 
		{
			System.out.println("Firefox browser is launched");
		}
		else if (browser.equals("ie")) 
		{
			System.out.println("ie browser is launched");
		}
		else 
		{
			System.out.println("No Browser name is matched");
		}
		
		
		
		
		//CrossBrowser test using selenium
		WebDriver driver=null;
		String BrowserName="firefox";
		
		if(BrowserName.equals("chrome"))
		{
			driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		}
		else if(BrowserName.equals("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		}
		
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		
		
		
		
		

	}

}
