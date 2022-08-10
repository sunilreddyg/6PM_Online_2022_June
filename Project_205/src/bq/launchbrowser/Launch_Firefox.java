package launchbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Note:--> To Work with firefox browser first we need to download
		 * 			geckodriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find browsers tab
		 * 		=> Click + button to see list of browsers
		 * 		=> Under firefox click on  documentation link
		 * 		
		 */
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\geckodriver.exe");
		
		//Launching firefox browser
		FirefoxDriver firefox=new  FirefoxDriver();
		
		//Loading webpage
		firefox.get("http://google.com");
		
		//Printing title of the page
		System.out.println(firefox.getTitle());
		
		

	}

}
