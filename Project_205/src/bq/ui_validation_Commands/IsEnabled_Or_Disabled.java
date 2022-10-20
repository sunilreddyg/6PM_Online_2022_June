package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled_Or_Disabled {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  	
		driver.get("https://www.instagram.com/");  
		driver.manage().window().maximize();  
		Thread.sleep(4000);
		
		
		//Checking login button is disabled before email and password entry					
		WebElement LoginButton=driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     '][contains(.,'Log In')]"));
		if(!LoginButton.isEnabled())  //!--Not
		{
			System.out.println("Testpass, Button is disabled before entry of name and email");
		}
		else
		{
			System.out.println("Testfail, Button is enabled before entry of name and email");
		}
		
		
		
		
			

	}

}
