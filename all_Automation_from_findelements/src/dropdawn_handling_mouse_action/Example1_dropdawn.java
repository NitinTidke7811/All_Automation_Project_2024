package dropdawn_handling_mouse_action;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_dropdawn {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
     "E:\\chromedriver_win88 (3)\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      Thread.sleep(3000);
     //step 1
      WebElement flipcrtlogin = driver.findElement(By.xpath("//a[text()='Login']"));
	
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   Thread.sleep(3000);
  // step2
      Actions act=new Actions(driver);
      //step3
    act.moveToElement(flipcrtlogin).perform();
    act.click().perform();
	
	
	
	
	}

}
