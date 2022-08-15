package launchbrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge_browser {

	public static void main(String[] args) 
	{
		
		
		//Setting environment variable for edge driver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUNIL\\OneDrive\\Desktop\\recent_drivers//msedgedriver.exe");
		
		//Launch edge browser
		EdgeDriver edge=new EdgeDriver();
		
		//load webpage
		edge.get("http://instagram.com");
		
		//Printing title of the page
		System.out.println(edge.getTitle());
		
		
		
		
		
		

	}

}
