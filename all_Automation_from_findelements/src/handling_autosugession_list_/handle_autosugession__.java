package handling_autosugession_list_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_autosugession__ {
       
	public static void main(String[] args) throws InterruptedException {
		    String exp="iphone11";
		    System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone11");
	         Thread.sleep(3000);
	        //right click on any sugession and inspect 
	         //it and move towards parent of sugession that highlight all sugg.
	         List<WebElement> allautosugession = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	        
	         for(WebElement sugession:allautosugession) 
	         {
	                 String actual_sgsn=sugession.getText();
	                 System.out.println(sugession.getText());
	                 
	        	    if(actual_sgsn.equals(exp)) 
	        	    {
	        		 
	        		   Thread.sleep(2000);
	        		    sugession.click();
	        		    break;
	        	    }
	         }

	}

}
