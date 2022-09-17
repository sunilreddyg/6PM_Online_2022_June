package switchcommands.Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Next_Window {

	public static void main(String[] args) {
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		//Click On HyperLink [This Link Open in New Tab]
		driver.findElement(By.xpath("//span[contains(.,'Remote')]")).click();
		
		
		
		//Get All Window Handles
		Set<String> AllWIndowIDs=driver.getWindowHandles();
		
		
		//COnvert Set<String> values into iterators
		Iterator<String> itr=AllWIndowIDs.iterator();
		
		//Read Each window iD using Next Keyword
		String W1=itr.next();
		String W2=itr.next();
		
		
		//switch to second window
		driver.switchTo().window(W2);
		System.out.println(driver.getTitle());
		
		
		/*
		 * //Switch to First window driver.switchTo().window(W1);
		 * System.out.println(driver.getTitle());
		 */
		

	}

}
