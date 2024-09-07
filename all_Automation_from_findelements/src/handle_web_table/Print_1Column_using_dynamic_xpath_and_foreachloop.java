package handle_web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_1Column_using_dynamic_xpath_and_foreachloop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/NITIN/Desktop/html/best%20tablehtml.html.html");

      String text = driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr[1]/th")).getText();
      System.out.println(text);
      List<WebElement> allrow1cell = driver.findElements(By.xpath("//table[@type='border:1px solid black']//tr/td[1]"));
      
      for(WebElement rowcell_1:allrow1cell) {
    	  System.out.println(rowcell_1.getText());
      }
      
      
	}

}
