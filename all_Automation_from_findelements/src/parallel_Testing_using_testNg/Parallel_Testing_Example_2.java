package parallel_Testing_using_testNg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Parallel_Testing_Example_2 {
	@Test
	public void tC2() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	 
		
	   driver.get("https://www.google.com/");
	   Thread.sleep(5000);
	  
	   
	} 

	}
