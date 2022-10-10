package ui_verificationCommands;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_PageTitle {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		//Capturing current window title presented at browser window
		String pageTitle=driver.getTitle();
		System.out.println("Current window page title is ---> "+pageTitle);
		
		//Expected Title
		String Exp_title="Instagram";
		
		
		//Comparing both expected and acutal title
		boolean flag=pageTitle.equals(Exp_title);
		
		//Writing a condition to continue script on Expected title presented
		if(flag==true)
		{
			System.out.println("Testpass,Expected title is presented");
		}
		else
		{
			System.out.println("Testfail,Expected title is not presented");
		}
		
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
		
		
		
		

		

	}

}
