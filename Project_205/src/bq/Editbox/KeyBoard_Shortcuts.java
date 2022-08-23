package bq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_Shortcuts {

	public static void main(String[] args) 
	{
		

		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("firstname")).sendKeys("Sunil"+Keys.TAB+"Gajjala");
		
		
		
		//Selecting dropdown option using sendkeys
		driver.findElement(By.id("day")).sendKeys("26");
		
		
		//Using Keyboard shortcut sequences
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		

	}

}
