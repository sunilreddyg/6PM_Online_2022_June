package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_input_Values_From_EntryBox {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement USername=driver.findElement(By.name("username"));
		USername.sendKeys("Kavya");  //Typing text into entry box..
		
		
		
		//Read Input Available at Entybox
		String InputValue=USername.getAttribute("value");
		System.out.println("Input Presented is --> "+InputValue);

	}

}
