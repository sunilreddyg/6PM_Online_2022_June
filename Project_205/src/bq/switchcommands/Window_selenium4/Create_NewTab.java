package switchcommands.Window_selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_NewTab {

	public static void main(String[] args) throws Exception {
	
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Get Current Window ID
		String W1=driver.getWindowHandle();
		
		System.out.println("Facebook Page title is --> "+driver.getTitle());
		
		
		
		WebDriver PayFb=driver.switchTo().newWindow(WindowType.TAB);
		PayFb.navigate().to("https://pay.facebook.com/");
		Thread.sleep(3000);
		
		
		System.out.println("Pay Facebook Page is ---> "+PayFb.getTitle());
		PayFb.findElement(By.xpath("(//a[contains(.,'Ways to Pay')])[1]")).click();
		
		
		//CLose Window
		Thread.sleep(3000);
		PayFb.close();
		

		//Switch to Previous window using WIndow ID
		Thread.sleep(2000);
		driver.switchTo().window(W1);
		driver.findElement(By.id("email")).sendKeys("Darshan");
		


	}

}
