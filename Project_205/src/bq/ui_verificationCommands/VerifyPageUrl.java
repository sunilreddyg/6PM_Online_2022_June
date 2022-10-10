package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyPageUrl {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Capturing current window url presented at browser window
		String Pageurl=driver.getCurrentUrl();
		System.out.println("Current window page url is ---> "+Pageurl);
		
		//Checking page is Secured or unSecured
		if(Pageurl.contains("https://"))
		{
			System.out.println("Page is Secured");
			
			WebElement Signup=driver.findElement(By.xpath("//span[contains(.,'Sign up')]"));
			Signup.click();
			
			//Verifying Signup title presented
			if(driver.getCurrentUrl().contains("accounts/emailsignup/"))
			{
				System.out.println("Signup page url is presented");
			}
			else
			{
				System.out.println("Signup page url is notpresented");
			}
			
		}
		else
		{
			System.out.println("Page is Not Secured");
		}

	}

}
