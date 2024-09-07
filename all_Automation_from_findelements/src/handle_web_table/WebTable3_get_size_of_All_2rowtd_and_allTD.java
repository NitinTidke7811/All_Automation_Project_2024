package handle_web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3_get_size_of_All_2rowtd_and_allTD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/NITIN/Desktop/html/best%20tablehtml.html.html");
      //size of data in all row
      List<WebElement> alltd = driver.findElements(By.xpath("//table[@type='border:1px solid black']//tr/td"));
	System.out.println(alltd.size());
	//size of column in rowno2 
	List<WebElement> row2tdsize = driver.findElements(By.xpath("//table[@type='border:1px solid black']//tr[2]/td"));
	System.out.println(row2tdsize.size());
	}

}
