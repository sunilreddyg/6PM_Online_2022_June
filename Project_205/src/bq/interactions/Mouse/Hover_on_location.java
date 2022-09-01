package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hover_on_location {

	public static void main(String[] args) {
		
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.jqueryscript.net/other/User-Interaction-With-Key-Sequence-jQuery-keySequence.html");
		driver.manage().window().maximize();
		
		
		WebElement Element=driver.findElement(By.xpath("//a[contains(@class,'vlightbox2')]"));
		new Actions(driver).moveToElement(Element).pause(3000).click().perform();
		
		
		

	}

}
