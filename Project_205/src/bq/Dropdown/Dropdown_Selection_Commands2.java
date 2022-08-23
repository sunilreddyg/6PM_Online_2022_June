package bq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Selection_Commands2 
{
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Selecting dropdown option using visible text
		WebElement StateDropdown=driver.findElement(By.id("customState"));
		new Select(StateDropdown).selectByVisibleText("Karnataka");
		
		//Selecting dropdown option using value property
		Thread.sleep(5000);
		WebElement CityDropdown=driver.findElement(By.name("cityName"));
		new Select(CityDropdown).selectByValue("chickmagalur");
		
		
		//Type Text into Entry box
		Thread.sleep(5000);
		WebElement Locality=driver.findElement(By.id("customLocality"));
		Locality.sendKeys("Gandhi Nagar");
		
		
		//Selecting dropdown option using index number
		WebElement Radius_Dropdown=driver.findElement(By.id("customRadius"));
		new Select(Radius_Dropdown).selectByIndex(4);
		
		
		
		
		
		
		
		
	}

}
