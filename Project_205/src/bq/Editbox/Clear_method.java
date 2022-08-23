package bq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clear_method {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("NewUser");
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Sunil");
		

	}

}
