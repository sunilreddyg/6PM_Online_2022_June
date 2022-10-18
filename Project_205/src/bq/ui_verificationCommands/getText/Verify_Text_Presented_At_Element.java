package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Verify_Text_Presented_At_Element 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		
		//Clicking on next button without enter email...
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
		
		
		//Identify Error Text location 
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String Act_error=Error_location.getText();
		System.out.println(Act_error);
		
		
		//COndition to verify Location Contains text or not
		if(Act_error!=null)
		{
			System.out.println("Text presented in location");
			
			//COndition to Verify Expected text presented at location
			String Exp_error="Enter a valid email address, phone number, or Skype name.";
			if(Act_error.equals(Exp_error))
			{
				System.out.println("location Contains Expected Error text");
			}
			else
			{
				System.out.println("Location not contains expected error text");
			}
			
			
		}
		else
		{
			System.out.println("Text not presented at location");
		}
		
		
		
		
		
		
		

	}

}
