package parallel_Testing_using_testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class parallel_Testing_Example_1 {
	
	@Test
	public void tC1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win88 (3)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
	    
	  driver.manage().window().maximize();
		
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(5000);
	   driver.close();
	   
	   
	}

}

