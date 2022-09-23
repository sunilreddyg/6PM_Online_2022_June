package capture_screen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreen_At_location {

	public static void main(String[] args) throws Exception {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement PageFooter=driver.findElement(By.id("pageFooter"));
		File src=PageFooter.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\selenium_dump\\workspace\\25_July_2022_6PM\\Project_205\\screens\\image2.png"));

	}

}
