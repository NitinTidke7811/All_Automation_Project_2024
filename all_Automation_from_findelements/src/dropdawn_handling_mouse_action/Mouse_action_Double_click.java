package dropdawn_handling_mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action_Double_click {

	public static void main(String[] args) throws InterruptedException {
		        System.setProperty("webdriver.chrome.driver",
			    "E:\\chromedriver_win88 (3)\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
                driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	            Thread.sleep(3000);
	            WebElement double_clic = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
	            Actions act=new Actions(driver);
	            
	             act.moveToElement(double_clic).doubleClick().build().perform();
	                act.doubleClick(double_clic).perform();
	}
	

}
