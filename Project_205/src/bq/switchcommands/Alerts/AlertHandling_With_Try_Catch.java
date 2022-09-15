package switchcommands.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling_With_Try_Catch 
{

	public static void main(String[] args) throws Exception
	{

		
		//setting runtime environment variable
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    //Clicking link to prompt alert
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	   // Alert_prompt_link.click();
	    Thread.sleep(3000);
	    
	    
	    
	    try {
			
	    	driver.switchTo().alert().accept();
	    	System.out.println("Alert is Closed");
	    	
		} catch (Exception e) {
			System.out.println("Alert Not presented at webpage");
		}
	    
	    
	    
	    
	    
	    

	}

}
