package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_On_location {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		
		
		//Perforing move hover on location..
		WebElement SignInMenu=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		new Actions(driver).moveToElement(SignInMenu).perform();
		
		
		Thread.sleep(2000);
		WebElement WatchList=driver.findElement(By.xpath("//span[contains(.,'Watchlist')]"));
		WatchList.click();
		
		
		
	}

}
