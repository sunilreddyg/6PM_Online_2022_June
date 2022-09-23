package robot_WindowInterface_Automation;


import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Actions 
{

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		
		//Create object fo robot interface
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		
		robot.mouseMove(304, 164);
		//Press Mouse left click action
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		robot.mouseMove(1080, 62);
		//Press Mouse left click action
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		

		robot.mouseMove(1025, 214);
		//Press Mouse left click action
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		//MouseWheel
		robot.mouseWheel(500);
				
				
	}

}
