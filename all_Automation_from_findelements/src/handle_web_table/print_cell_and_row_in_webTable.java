package handle_web_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_cell_and_row_in_webTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/NITIN/Desktop/html/best%20tablehtml.html.html");
                 
           int rosize = driver.findElements(By.xpath("//table[@type='border:1px solid black']//tr")).size();
               
           for(int i=1;i<=rosize;i++) {
        	  int colmnsize = 0;
        	   if(i==1) {
        		   colmnsize=driver.findElements(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/th")).size();
        	   }
        	   else {
        			   colmnsize=driver.findElements(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/td")).size();
        			   
        		 }
        	   for(int j=1;j<=colmnsize;j++)
        	   {
        		   String text=" ";
        		   if(i==1)
        		   {
        			   text=driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/th["+j+"]")).getText();
        		   
        		   }
        		   else {
        			   text=driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/td["+j+"]")).getText(); 
        			   }
        		   System.out.print(text+"   ");
        	  }
        	  System.out.println();
           }
       }
    }


