package pom_testNg_DDF_Base_and_Utility_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base
{
	static WebDriver driver;
	public static  void browserOpen() 
	{
		 System.setProperty("webdriver.chrome.driver",
	     "E:\\chromedriver_win88 (3)\\chromedriver.exe");
		 ChromeOptions option=new ChromeOptions();
	
		 option.addArguments("--disable-notifications");
		 driver = new ChromeDriver(option);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://kite.zerodha.com/");
	}
}
