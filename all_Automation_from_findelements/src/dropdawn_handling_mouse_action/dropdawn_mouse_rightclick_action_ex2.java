package dropdawn_handling_mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdawn_mouse_rightclick_action_ex2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
			     "E:\\chromedriver_win88 (3)\\chromedriver.exe");
			      WebDriver driver = new ChromeDriver();
			      driver.get("https://www.flipkart.com/");
			      
			      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			   
			      //step1
			     WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
			    //step2
			     Actions act=new Actions(driver);
			    
			     //step3  rightclick on more tab option
			    act.moveToElement(more).contextClick().build().perform();
			     
			     //step3 optional way right clic
			    //act.contextClick(more).perform();
			    
			     //step3 optional
			    act.moveToElement(more);
			     act.contextClick().perform();
			      
	}

}
