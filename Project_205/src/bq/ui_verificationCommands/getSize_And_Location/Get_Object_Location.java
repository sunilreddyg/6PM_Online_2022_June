package ui_verificationCommands.getSize_And_Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Object_Location {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip'][contains(.,'Round Trip')]"));
		
		//Get Object Coordinates
		int OBjx=Roundtrip.getLocation().getX();
		int OBjy=Roundtrip.getLocation().getY();
		

		System.out.println("Object x coordinates are ---> "+OBjx);
		System.out.println("Object y coordinates are ---> "+OBjy);
		
		
		//Get System Dimension
		int Total_WIndow_Coordinates=driver.manage().window().getSize().getWidth();
		if(Total_WIndow_Coordinates/2 > OBjx)
			System.out.println("Object is located at left side of the page");
		else
			System.out.println("Object is located at right side of the page");
		
		
		
		//Verify Object is Visible at webapge using it's Coordinates
		if(OBjx > 0)
			System.out.println("Object is visible at webpage");
		else
			System.out.println("Object is not visible at webpage");
		
		
	}

}
