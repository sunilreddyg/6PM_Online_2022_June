package bq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectin_Multiple_Options {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://www.bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement SelectMenuLink=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenuLink.click();
		Thread.sleep(3000);
		
		
		WebElement Dropdown2=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag1=new Select(Dropdown2).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag1);
		
		
		
		if (flag1) 
		{
			new Select(Dropdown2).deselectAll();   //Deselect only perform on multiple selection type
			new Select(Dropdown2).selectByIndex(1);
			new Select(Dropdown2).selectByIndex(3);
			new Select(Dropdown2).selectByIndex(5);
			
			Thread.sleep(2000);
			new Select(Dropdown2).deselectByIndex(3);
			
		} else 
		{
			System.out.println("Dropdown is a single option selection type");
		}
		
	
		


	}

}
