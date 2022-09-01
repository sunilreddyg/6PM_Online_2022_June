package interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick_On_Element 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Use Mouse Right click at location
		WebElement Element=driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
		new Actions(driver).contextClick(Element).perform();
		Thread.sleep(2000);
		
		//Click using mouse interfactions command
		WebElement Delete_button=driver.findElement(By.xpath("(//span[contains(.,'Delete')])[2]"));
		new Actions(driver).click(Delete_button).perform();
		
		
		
		
	}

}
