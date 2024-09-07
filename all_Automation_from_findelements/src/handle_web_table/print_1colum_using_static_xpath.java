package handle_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_1colum_using_static_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/NITIN/Desktop/html/best%20tablehtml.html.html");
             for(int i=1;i<=4;i++) {
            	 String text="";
            	  if(i==1) {
            		 text =driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/th[1]")).getText();
            	
            	  }
            	  else {
            		  text=driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/td[1]")).getText();
            	
             }
      System.out.println(text+" ");
	   }
	}
}
