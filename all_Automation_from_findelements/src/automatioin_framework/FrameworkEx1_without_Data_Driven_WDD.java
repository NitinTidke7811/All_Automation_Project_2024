package automatioin_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkEx1_without_Data_Driven_WDD {
 
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"E:\\geckodriver\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://kite.zerodha.com/");
	    //1.enter UN 
	    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
	    //2.enter pass
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijay@123");
	    //click login
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    //enter pin
	    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
	    //click on continue
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	  String expun="DV1510";
	    String actun = driver.findElement(By.xpath("//span[text()='DV1510']")).getText();
	    	if(actun.equals(expun)) {
	    		System.out.println("pass");
	    		
	    	}
	    	else {
	    		System.out.println("fail");
	    	}

	}

}
