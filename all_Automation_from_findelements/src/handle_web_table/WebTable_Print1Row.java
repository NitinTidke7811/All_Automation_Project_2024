package handle_web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Print1Row {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/NITIN/Desktop/html/best%20tablehtml.html.html");
                  List<WebElement> rowt1ableheaders = driver.findElements(By.xpath("//table[@type='border:1px solid black']//tr[1]/th"));
	for(WebElement header:rowt1ableheaders) {
		System.out.print(header.getText()+" ");
	}
	
	}

}
