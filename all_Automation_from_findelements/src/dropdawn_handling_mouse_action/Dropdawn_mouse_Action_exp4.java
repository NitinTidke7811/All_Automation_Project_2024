package dropdawn_handling_mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdawn_mouse_Action_exp4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			     "E:\\chromedriver_win88 (3)\\chromedriver.exe");
			      WebDriver driver = new ChromeDriver();
			      driver.get("http://demo.guru99.com/test/drag_drop.html");
                    Thread.sleep(3000);
                    
                   WebElement source = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
                  
                   WebElement destination = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
	           Actions act=new Actions(driver);
	           //act.moveToElement(source).clickAndHold().moveToElement(destination);
	          Thread.sleep(5000);
	         //  act.release().build().perform();
	           
	           act.dragAndDrop(source, destination).perform();
	           
	           
	
	}

}
