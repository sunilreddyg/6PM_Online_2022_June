package switchcommands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_With_OK_Button {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    //Clicking link to prompt alert
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	    
	    //Read text at alert
	    String AlertMsg=driver.switchTo().alert().getText();
	    System.out.println(AlertMsg);
	  
	    
	    //Switch to alert and click ok button
	    driver.switchTo().alert().accept();
	    System.out.println("Pressed Ok button at alert");
	    
	}

}
