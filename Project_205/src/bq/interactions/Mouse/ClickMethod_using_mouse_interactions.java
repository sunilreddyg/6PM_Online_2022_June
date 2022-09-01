package interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickMethod_using_mouse_interactions {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		WebElement Upload_And_Download_link=driver.findElement(By.xpath("//button[contains(.,'Upload & Download')]"));
		Upload_And_Download_link.click();
		Thread.sleep(5000);
		
		
		//Clicking on location using mouse interaction method..
		WebElement Upload_btn=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		new Actions(driver).click(Upload_btn).perform();
		
		
		
		
		
		

	}

}
