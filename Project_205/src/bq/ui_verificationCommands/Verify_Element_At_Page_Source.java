package ui_verificationCommands;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Element_At_Page_Source 
{

	public static void main(String[] args) throws Exception 
	{
	
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		/*
		 * In PageSource We can verify PageTitle,Pageurl,PageObjects ---etc
		 */
		
		
		//Capturing current window pagesource
		String Pagesource=driver.getPageSource();
		
		if(Pagesource.contains("Sunil"))
			System.out.println("Element is presented at source");
		else
			System.out.println("Element is not presented at source");
		
		
		
		
		
		
		
		
				

	}

}
