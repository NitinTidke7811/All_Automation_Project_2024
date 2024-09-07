package handle_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verfy_all_td_inWebtable{

	public static void main(String[] args) {
		String exp="java";
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win88 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/NITIN/Desktop/html/best%20tablehtml.html.html");
        int rowsize = driver.findElements(By.xpath("//table[@type='border:1px solid black']//tr")).size();    
        for(int i=2;i<=rowsize;i++) {
        	int colsize = driver.findElements(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/td")).size();
        	for(int j=1;j<=colsize;j++) {
        		String act="";
        		if(i==1) {
        			act=driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/th["+j+"]")).getText();
        			if(act.equals(exp)) {
        				System.out.println("java found at"+i+" ,"+j );
        			}
        		}
        			else {
        				act=driver.findElement(By.xpath("//table[@type='border:1px solid black']//tr["+i+"]/td["+j+"]")).getText();
        				if(act.equals(exp)) {
        					System.out.println("java found at"+i+" ,"+j);
        				}
        				
        			}
        			
        		}
        	System.out.println();
        }
	} 	
 	
        	
        	
  }
	


