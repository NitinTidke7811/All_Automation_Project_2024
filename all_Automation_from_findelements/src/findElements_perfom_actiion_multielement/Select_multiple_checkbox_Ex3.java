package findElements_perfom_actiion_multielement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_multiple_checkbox_Ex3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		   driver.get("file:///C:/Users/NITIN/Desktop/html/checkbox.html");
			driver.manage().window().maximize();
			List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
			           System.out.println("size of checkbox"+allcheckbox.size());
			           for(WebElement checkbox:allcheckbox) {
			        	   checkbox.click();
			        	   Thread.sleep(3000);
			           }
	

	}

}
