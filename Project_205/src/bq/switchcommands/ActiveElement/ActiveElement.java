package switchcommands.ActiveElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElement {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().activeElement().sendKeys("Darshan");
		
		
		driver.get("http://naukri.com");
		
		
		
		driver.findElement(By.name("expereinceDD")).click();
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

	}

}
