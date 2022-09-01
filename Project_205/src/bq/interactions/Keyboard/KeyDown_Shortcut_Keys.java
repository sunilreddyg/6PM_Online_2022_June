package interactions.Keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyDown_Shortcut_Keys {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
	    driver.get("https://www.jqueryscript.net/demo/keyboard-shortcut-handling/");
	    driver.manage().window().maximize();
	    
	    
	    //Press Alt + F1 Key
	    new Actions(driver).keyDown(Keys.ALT).sendKeys(Keys.F1).perform();
	    Thread.sleep(4000);
	    
	    
	    //Press Escape key at your browser
	    new Actions(driver).sendKeys(Keys.ESCAPE).perform();
	    

	}

}
