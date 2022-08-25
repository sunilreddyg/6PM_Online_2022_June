package bq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Dropdown_Is_Multiple_Selection_type {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://www.bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement SelectMenuLink=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenuLink.click();
		Thread.sleep(3000);
		
		
		WebElement Dropdown1=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		boolean flag=new Select(Dropdown1).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag);
		
		
		WebElement Dropdown2=driver.findElement(By.id("exampleFormControlSelect2"));
		boolean flag1=new Select(Dropdown2).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag1);
		
		
		
		

	}

}
