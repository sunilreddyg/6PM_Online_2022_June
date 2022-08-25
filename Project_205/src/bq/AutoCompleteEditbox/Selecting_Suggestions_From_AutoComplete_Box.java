package bq.selenium.AutoCompleteEditbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecting_Suggestions_From_AutoComplete_Box {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		WebElement FromBanner=driver.findElement(By.xpath("//span[contains(.,'From')]"));
		FromBanner.click();
		Thread.sleep(3000);
		
		
		WebElement From_EB=driver.findElement(By.xpath("//input[contains(@placeholder,'From')]"));
		From_EB.sendKeys("Pune");
		
		WebElement PuneCity=driver.findElement(By.xpath("//div[@class='calc60'][contains(.,'Pune, India Pune Airport')]"));
		PuneCity.click();
		
		
		WebElement To_EB=driver.findElement(By.xpath("//input[contains(@placeholder,'To')]"));
		To_EB.sendKeys("BLR");
		Thread.sleep(3000);
		
		WebElement BangloreCity=driver.findElement(By.xpath("//div[@class='calc60'][contains(.,'Bengaluru, India Bengaluru International Airport')]"));
		BangloreCity.click();
		

	}

}
