package switchcommands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swith_To_Frame {

	public static void main(String[] args) {
		

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/account/trips");
	    driver.manage().window().maximize();
	    
	    
	    //Switch Controls Page to Frame with FrameID/FrameName Property
	    driver.switchTo().frame("modal_window");
	    
	    
	    WebElement Email=driver.findElement(By.xpath("//input[@placeholder='EmailId']"));
	    Email.sendKeys("info.dsnr@gmail.com");
	    
	    WebElement TripId=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
	    TripId.sendKeys("86876687");
	    
	    
	    //Get Controls back to main page
	    driver.switchTo().defaultContent();
	    
	    
	    WebElement Home=driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/']"));
	    Home.click();

	}

}
