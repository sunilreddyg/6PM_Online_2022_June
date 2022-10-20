package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.outlook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
								
	
		//Identify Signin button
		WebElement Signin_btn=driver.findElement(By.xpath("//a[text()='Sign in']"));
		if(Signin_btn.isDisplayed())
		{
			System.out.println("Object is Visible at webpage");
		}
		else
		{
			System.out.println("Object is Not visible at webpage");
		}
		
		

		/*
		 * Note:--> For every object need not to verify object visible and
		 * 			enabled status, Because selenium is desinged to perform
		 * 			action on visible and enabled objects only.
		 * 		
		 * 			WebDriver throws below exceptions when user try invalid
		 * 			actions.
		 * 
		 * ElementNotvisibleException   
		 * 			==> It Throws When user perform action on hidden element  
		 * InvalidElementstateException 
		 * 			==> It Throws When user perform action on disabled element
		 */
		
		
		
		
		
		
		
	
			
			
		
		
		
		
		
		
		

	}

}
