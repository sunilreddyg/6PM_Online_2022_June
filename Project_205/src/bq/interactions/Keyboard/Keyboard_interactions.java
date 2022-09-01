package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_interactions {

	public static void main(String[] args) {
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		WebElement From=driver.findElement(By.xpath("//input[@id='fsc-origin-search']"));
		new Actions(driver)
		.click(From)
		.sendKeys(Keys.BACK_SPACE).pause(1000)
		.sendKeys("BLR").pause(4000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).perform();

	}

}
