package switchcommands.Windows;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Second_Window {

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Get Mainwindow ID
		String MainwindowID=driver.getWindowHandle();
		
		
		//Click On HyperLink [This Link Open in New Tab]
		driver.findElement(By.xpath("//span[contains(.,'Remote')]")).click();
		Thread.sleep(5000);
		
		
		//Get All Dynamic Window ID's
		Set<String> AllWindowIDs=driver.getWindowHandles();
		
		for (String EachwindowID : AllWindowIDs) 
		{
			driver.switchTo().window(EachwindowID);
		}
		
		//Note :--> Here assumption is when iteration finish with loop
		// by default window controls available at second window...
		System.out.println("Current Window titel is --> "+driver.getTitle());
		
		
		
		//Get Back Controls to mainwindow
		driver.switchTo().window(MainwindowID);
		System.out.println("Main mindow title is ---> "+driver.getTitle());
		
		
		/*
		 * Note:--> Use above syntax only when two windows are opened..
		 */

	}

}
