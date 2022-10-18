package ui_verificationCommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute_Testcase2 {

	public static void main(String[] args) throws Exception 
	{
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		/*
		 * Testcase:-->
		 * 			Verify login button is disabled Before
		 * 			Enter username and Password
		 */
		
		
		WebElement LoginButton=driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     '][contains(.,'Log In')]"));
	    if(LoginButton.getAttribute("disabled")!=null)
	    {
	    	System.out.println("Testpass, OBject is disabled");
	    }
	    else
	    {
	    	System.out.println("Testfail, Object is Enabled");
	    }
	    
	    
	    /*
	     * Testcase:-->
	     * 			Verify Login button is enabled after typing
	     * 			username and password
	     */
	    
	    
	    
	}

}
