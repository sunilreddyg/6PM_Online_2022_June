package switchcommands.Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class SwitchTo_window_With_Title {

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
		
		driver.findElement(By.xpath("//span[@title='MNC']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[contains(.,'Analytics')])[1]")).click();
		Thread.sleep(4000);
		
		
		//Get All Dynamic Window ID's
		Set<String> AllWindowIDs=driver.getWindowHandles();
		
		for (String EachwindowID : AllWindowIDs) 
		{
			String Runtime_title=driver.switchTo().window(EachwindowID).getTitle();
			if(Runtime_title.contains("Remote Jobs"))
			{
				break;    //When Title matches it break the loop , By Default controls exist in Same window
			}
		}
		
		
		System.out.println("Current window Title is ---> "+driver.getTitle());
		
		
		
		
		

	}

}
