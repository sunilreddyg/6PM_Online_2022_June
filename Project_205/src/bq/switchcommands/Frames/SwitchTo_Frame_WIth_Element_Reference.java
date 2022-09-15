package switchcommands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Frame_WIth_Element_Reference {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://www.redbus.in/info/redcare");
	    driver.manage().window().maximize();
	    
	    
	    //Switch Controls Page to Frame
	    WebElement Frame1=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	    driver.switchTo().frame(Frame1);
	    
	    
	    WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
	    MobileNumber.sendKeys("9030248855");
	    
	    //Get Controls back to Main Page
	    driver.switchTo().defaultContent();
	    
	    WebElement WindowClose=driver.findElement(By.xpath("//i[@class='icon-close']"));
	    WindowClose.click();

	}

}
