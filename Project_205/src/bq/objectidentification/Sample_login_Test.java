package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_login_Test {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("email")).sendKeys("qadarshan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Darsh@123");
		driver.findElement(By.name("login")).click();
		
		
		
		
		

	}

}
