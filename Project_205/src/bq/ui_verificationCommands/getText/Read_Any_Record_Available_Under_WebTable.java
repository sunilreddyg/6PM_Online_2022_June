package ui_verificationCommands.getText;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Any_Record_Available_Under_WebTable {

	public static void main(String[] args) 
	{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icicidirect.com/equity/sector-overview");
		driver.manage().window().maximize();
		
		//Identifying table location
		WebElement IndexTable=driver.findElement(By.id("tbl_sector0"));
		
		//Read Entire table text
		String TableText=IndexTable.getText();
		if(TableText.contains("State Bank of India"))
		{
			System.out.println("In Today top 5 list State bank is available");
		}
		else
		{
			System.out.println("in Today top 5 list state bank is not available");
		}
		
		
		
		
		
		
		

	}

}
