package dropdawn_handling_mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exp3_dropdaunmouse_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			     "E:\\chromedriver_win88 (3)\\chromedriver.exe");
			      WebDriver driver = new ChromeDriver();
			      driver.get("https://www.flipkart.com/");
			      
			      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			   Thread.sleep(300);
			      WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
			      
			      Actions act=new Actions(driver);
			    //  option1
			     act.moveToElement(login).perform();
			     Thread.sleep(3000);
			     act.click().perform();
			      //option2
			     // act.click(login).perform();
			     //option 3
			      //act.moveToElement(login).click().build().perform();
	}

}
