package POM_TestNG_base_Utility_properties_file_;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base
{
	static WebDriver driver;
	
	public static  void browserOpen() throws IOException 
	{
		 System.setProperty("webdriver.chrome.driver",
	     "C:\\\\Users\\\\Tidke\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		 ChromeOptions option=new ChromeOptions();
	
		 option.addArguments("--disable-notifications");
		 driver = new ChromeDriver(option);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get(Utility.getPropertyFileData("URL"));
	}
}
