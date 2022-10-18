package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Text_presented_At_Webpage {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		
		//Identify Page
		WebElement Page=driver.findElement(By.tagName("body"));
		
		//Read entire page visible text
		String PageText=Page.getText();
		System.out.println(PageText);
		
		//Checking Header presented at webpage
		if(PageText.contains("Sign in"))
		{
			System.out.println("Header Text presented at webpage");
		}
		else
		{
			System.out.println("Header Text not presented at webapge");
		}
		
		
		//Verifying Error Text PResented at webapge
		String Exp_error="Enter a valid email address, phone number, or Skype name.";
		if(PageText.contains(Exp_error))
		{
			System.out.println("Error Text pResented at webpage");
		}
		else
		{
			System.out.println("Error Text not presented at webpage");
		}
		
		
		
		
		
		
		
		


	}

}
