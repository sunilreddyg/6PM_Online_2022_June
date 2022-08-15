package webdriver_manager;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_WebDriver_Manager 
{

	public static void main(String[] args) 
	{
		
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		
		
		/*
		 * chromedriver():--> it will avoid downloading chromedriver into local system
		 * Create():--->   It Create Browser instance
		 * avoidShutdownHook() :--->   It keeps automation browser without shutdown
		 * 
		 */
		
		/*
		 * WebDriverManager
		 * Where to download webdrierManager:-->
		 * 		https://jar-download.com/artifact-search/webdrivermanager
		 * 		Download Latest jar file 5-Version
		 * 		Un-zip file and add all libraries to current project..
		 */
		
	}

}
