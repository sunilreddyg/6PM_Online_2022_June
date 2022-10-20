package ui_verificationCommands.getSize_And_Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Object_SIze {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip'][contains(.,'Round Trip')]"));
		
		
		
		//Get OBject Height and width
		int Obj_Height=Roundtrip.getSize().getHeight();
		int Obj_Width=Roundtrip.getSize().getWidth();
		
		System.out.println("Object Height is --> "+Obj_Height);
		System.out.println("Object widht is ---> "+Obj_Width);
		
		
		
		//Object visible using height and width
		if(Obj_Height > 0)
			System.out.println("Object is visible at webpage");
		else
			System.out.println("Object is not visible at webpage");

	}

}
