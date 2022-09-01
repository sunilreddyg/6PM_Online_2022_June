package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys_Example {

	public static void main(String[] args) throws Exception 
	{
	
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement From_location=driver.findElement(By.xpath("//span[contains(.,'From')]"));
		From_location.click();
		Thread.sleep(3000);
		
		
		new Actions(driver).sendKeys("BLR")
		.pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(1000)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		WebElement To_location=driver.findElement(By.xpath("//span[@class='lbl_input latoBold  appendBottom5'][contains(.,'To')]"));
		new Actions(driver).click(To_location).pause(1000).sendKeys("DEL").pause(2000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		

	}

}
