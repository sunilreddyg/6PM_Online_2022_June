package bq.selenium.Datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecting_Data_From_Date_Picker
{

	public static void main(String[] args) throws Exception {
		
	WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
	driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
	driver.manage().window().maximize();
	
	//Opening Calendar
	driver.findElement(By.id("datepicker")).click();
	Thread.sleep(1000);

	
	
	/*
	 * If Datepicker editbox is in editable format
	 * so that we can type required date
	 */
	driver.findElement(By.id("datepicker")).clear();
	driver.findElement(By.id("datepicker")).sendKeys("03/25/2022");
	
	
	}

}
