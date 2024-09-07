package handling_autosugession_list_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_google_serch_autosugession 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oneplus");
             Thread.sleep(2000);
             List<WebElement> allsugession = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
             
                  for(WebElement sugession:allsugession) {
                	  System.out.println(sugession.getText());
                	  
                  }
	}

}
