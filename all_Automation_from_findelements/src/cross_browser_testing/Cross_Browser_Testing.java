package cross_browser_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_Testing {
	@Parameters("browserName")
	
	@Test
	public void crossBrowserTesting(String browserName) throws InterruptedException {
		
		WebDriver  driver=null;
		
		
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Tidke\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    driver = new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					"E:\\geckodriver\\geckodriver.exe");
		     driver = new FirefoxDriver();

			
			
			
		}
		
		
		
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("https://www.facebook.com/");
		
	}
	
}
