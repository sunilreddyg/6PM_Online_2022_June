package capture_screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture_ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		
		//Capturing screen and converting into output file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Create folder in local system
		FileHandler.createDir(new File("screens"));
		//Copy file to local system
		FileHandler.copy(src, new File("screens//Image1.png"));

	}

}
