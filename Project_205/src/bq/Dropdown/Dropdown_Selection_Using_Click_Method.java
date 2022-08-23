package bq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Selection_Using_Click_Method {

	public static void main(String[] args) {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		WebElement DayDropdown=driver.findElement(By.id("day"));
		DayDropdown.findElement(By.xpath("//option[@value='12'][contains(.,'12')]")).click();
		
		
		WebElement MonthDropdown=driver.findElement(By.id("month"));
		MonthDropdown.findElement(By.xpath("//option[@value='4'][contains(.,'Apr')]")).click();
		
		
		//We can also take xpath of option tag directly..
		WebElement YearDropdown=driver.findElement(By.xpath("//option[@value='1986'][contains(.,'1986')]"));
		YearDropdown.click();
	}

}
