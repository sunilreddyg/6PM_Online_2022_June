package bq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Selection_Commands1 {

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//selecting dropdown option using option name
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("18");
		
		//Selecting dropdown option using value property
		new Select(driver.findElement(By.id("month"))).selectByValue("11");
		
		//Selecting dropdown option using index value
		new Select(driver.findElement(By.id("year"))).selectByIndex(12);
	}

}
