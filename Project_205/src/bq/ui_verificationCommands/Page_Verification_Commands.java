package ui_verificationCommands;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page_Verification_Commands {

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://redbus.com");
		driver.manage().window().maximize();
		
		
		//Capturing current window title presented at browser window
		String pageTitle=driver.getTitle();
		System.out.println("Current window page title is ---> "+pageTitle);
		
		
		//Capturing current window url presented at browser window
		String Pageurl=driver.getCurrentUrl();
		System.out.println("Current window page url is ---> "+Pageurl);
		
		//Capturing current window DYnamic ID
		String WindowID=driver.getWindowHandle();
		System.out.println("Current Window ID is ----> "+WindowID);
		
		
		//Capturing current window pagesource
		String Pagesource=driver.getPageSource();
		System.out.println(Pagesource);
		

	}

}
