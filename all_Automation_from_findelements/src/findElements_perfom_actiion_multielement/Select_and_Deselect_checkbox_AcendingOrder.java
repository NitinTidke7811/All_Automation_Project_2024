package findElements_perfom_actiion_multielement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_and_Deselect_checkbox_AcendingOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		   driver.get("file:///C:/Users/NITIN/Desktop/html/checkbox.html");
		    List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		   
		    System.out.println(allcheckbox.size());
                       for(int i=0;i<=allcheckbox.size()-1;i++) {
                    	   allcheckbox.get(i).click();
                    	   Thread.sleep(3000);
                    	   
                       }
                       for(int i=0;i<=allcheckbox.size()-1;i++)
                       {
                    	   allcheckbox.get(i).click();
                    	   Thread.sleep(3000);
	                   }
                     // to click on single checkbox  by xpath by index
                   driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();    
	}
}
