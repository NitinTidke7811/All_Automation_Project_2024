package handle_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_the_data_In_webTable_by_using_static_xpath {
    
	public static void main(String[] args) {
		    String exp="java";
		    System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
            driver.get("file:///C:/Users/NITIN/Desktop/html/best%20tablehtml.html.html");
   
      for(int i=1;i<=4;i++) 
      {
         for(int j=1;j<=3;j++) 
    	  {
    	     String act="";
              if(i==1) 
              {
                 act=driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/th["+j+"]")).getText();
                    
                 if(act.equals(exp))
                  {
        	        System.out.println("java found at "+i+" "+j);
        	   
                  }
              }
             else 
             {
               act=driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/td["+j+"]")).getText();
                 if(act.equals(exp)) 
                 {
        	       System.out.println("java found at "+i+" "+j);
                  }
             }
           
    	  }
	
      }	
}
}

