package findElements_perfom_actiion_multielement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size_of_all_elements_in_webpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win88 (3)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

                List<WebElement> linksize = driver.findElements(By.xpath("//a"));
	                            System.out.println(linksize.size());
	
	}

}
