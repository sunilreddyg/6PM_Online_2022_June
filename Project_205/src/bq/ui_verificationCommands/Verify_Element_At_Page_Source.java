package ui_verificationCommands;

import org.openqa.selenium.By;
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
		
		//Using Condition looking for required element presented at source..
		if(Pagesource.contains("username"))
			System.out.println("Element is presented at source");
		else
			System.out.println("Element is not presented at source");
		
		
		
		//We can also handle element presented at webpage using try-catch block also..
		try {
			driver.findElement(By.name("password")).sendKeys("Admin");
			System.out.println("Element Presented at source");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Element not presented at source");
		}
		
		
		System.out.println("Run Will be COntiue");
		
		
		
		
		
		
		
		
		
		
				

	}

}
