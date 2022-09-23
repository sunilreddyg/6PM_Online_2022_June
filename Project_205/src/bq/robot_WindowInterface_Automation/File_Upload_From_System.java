package robot_WindowInterface_Automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_From_System 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://bridgeqsystems.com/demo.php");;
		driver.manage().window().maximize();
		
		
		WebElement Upload_link=driver.findElement(By.xpath("//button[contains(.,'Upload & Download')]"));
		Upload_link.click();
		Thread.sleep(8000);
		
		
		WebElement Button_ChooseFile=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		new Actions(driver).click(Button_ChooseFile).click().perform();
		Thread.sleep(4000);
		
		
		String path="C:\\Users\\SUNIL\\OneDrive\\Desktop\\29th_Nov_11_30_AM-main (1)\\29th_Nov_11_30_AM-main\\Defect_Report.docx";
		
		
		
		//CopyString to Clipboard
		StringSelection spath=new StringSelection(path);
		//Get System clipbaord 
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//now selected text set into clipboard memory
		clipboard.setContents(spath, spath);
		
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		
		//Press Control+V shortcut 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Contrl Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
				
		
		//Press Enter Key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		

	}

}
