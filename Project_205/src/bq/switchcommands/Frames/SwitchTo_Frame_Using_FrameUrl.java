package switchcommands.Frames;

import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Frame_Using_FrameUrl {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/info/redcare");
	    driver.manage().window().maximize();
	    
	    
	    
	    //Navigate to Frame using Frameurl
	    driver.navigate().to("https://www.redbus.in/login?offerType=Support&defaultSlide=home&isOnlyMobile=false");
	    
	    WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
	    MobileNumber.sendKeys("9030248855");
	    Thread.sleep(5000);
	    
	    //Navigate back to previous page
	    driver.navigate().back();
	}

}
