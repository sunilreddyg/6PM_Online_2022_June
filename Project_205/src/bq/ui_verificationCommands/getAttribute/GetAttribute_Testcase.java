package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute_Testcase {

	public static void main(String[] args) throws Exception {
	
		/*
		 * Given site url is http://makemytrip.com
		 * And make sure one way radio button is Selected
		 * Then Verify Double Seat fares selection is active
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		
		//Identifying oneway radio button
		WebElement oneway=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		//Get Class Property at runtime
		String RuntimeClass=oneway.getAttribute("class");
		
		if(RuntimeClass.contains("selected"))
		{
			System.out.println("On browser lauch oneway radio button is selected");
			
			
			WebElement DoubleSeatFares=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[6]"));
			String Runtime_Class1=DoubleSeatFares.getAttribute("class");
			if(!Runtime_Class1.contains("isItemDisabled"))
			{
				System.out.println("OBject is Enabled on Oneway selection");
			}
			else
			{
				System.out.println("object is disabled on oneway selection");
			}
			
			
		}
		else
		{
			System.out.println("On browser launch onway radio button is not selected");
		}
		
	
		
		
		
	}

}
