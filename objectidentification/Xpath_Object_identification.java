package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Object_identification {

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Ajaykumar@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("AjayKumar@gmail.com");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
	}

}
