package handle_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_all_data_td_and_th_inwebTable {

	public static void main(String[] args) {
		String exp="java";
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
        		   String acttext=" ";
        		   if(i==1)
        		   {
        			   
        			  acttext=driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/th["+j+"]")).getText();
        		   if(acttext.equals(exp)) {
        			   System.out.println("sr no  found at "+i+","+j);
        		   }
        		   }
        		   else {
        			   
        			   acttext=driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/td["+j+"]")).getText(); 
        			  if(acttext.equals(exp)) {
        				  System.out.println("java found at"+i+","+j);
        			  }
        		   }
        		   
        	  }
        	 
           }

	}

}
