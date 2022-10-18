package ui_verificationCommands.getCssvalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Read_Object_Styles {

	public static void main(String[] args) throws Exception {
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip'][contains(.,'Round Trip')]"));
		
		//Read Color of object
		String Obj_color=Roundtrip.getCssValue("color");
		System.out.println("Object Color in RGBA format ---> "+Obj_color);
		//RGBA [Red,Green,Blue,Alpha]
		
		//Read Font size at location
		String FontSize=Roundtrip.getCssValue("font-size");
		System.out.println("Text Size available is --> "+FontSize);
		
		
		//Selecting Rondtrip
		Roundtrip.click();
		Thread.sleep(2000);
		
		
		//Read Color of object after selection
		String Obj_color1=Roundtrip.getCssValue("color");
		System.out.println("Object Color in RGBA format ---> "+Obj_color1);
		
		
		if(Obj_color1.equals("rgba(0, 0, 0, 1)"))
			System.out.println("Testpass, Roundtrip is Selected");
		else
			System.out.println("Roundtrip is not selected");
		
		
		
		
		

	}

}
