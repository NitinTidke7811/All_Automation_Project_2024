package findElements_perfom_actiion_multielement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_all_link_in_webpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win88 (3)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        List<WebElement> multiplelink = driver.findElements(By.xpath("//a"));
             for(WebElement link:multiplelink) {
            	 System.out.println(link.getText());
             }
        

	}

}
