package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> To Work with chrome browser first we need to download
		 * 			chromedriver.exe file
		 * 
		 * 		=> https://chromedriver.chromium.org/downloads
		 * 		=> Download chromedriver w.r.t chrome browser version
		 * 		=> click on chromedriver version link
		 * 		=> after select chromedriver version it will land on INdex page
		 * 		=> w.r.t operating system download zipformat file
		 * 		=> unzip file to backup folder [You receive chromedriver.exe file]
		 * 
		 * 		Note:--> Either set environment variable in system settings or
		 * 				define runtime environment variable before launch chrome browser
		 * 
		 * 
		 */
		
		
		//Setting runtime environment variable 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers\\chromedriver.exe");
		
		//Launch chrome browser
		ChromeDriver chrome=new ChromeDriver();
		
		//Load webpage using browser reference
		chrome.get("https://www.facebook.com/");
		
		//printing page title
		System.out.println(chrome.getTitle());
		
		//Close browser
		chrome.close();


	}

}
