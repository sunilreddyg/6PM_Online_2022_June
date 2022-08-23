package bq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys_With_Keyboard_Shortcuts {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		//Clicking on sign in button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Typing email at  edit box and pressing Enter Key..
		driver.findElement(By.id("i0116")).sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(5000);  //Static time to load Password object..
		
		//Typing password 
		driver.findElement(By.name("passwd")).sendKeys("Hello@123"+Keys.ENTER);

	}

}
