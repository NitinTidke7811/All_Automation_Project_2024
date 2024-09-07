package page_object_module_framework_pom_WDD;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_class_login_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
	   "E:\\chromedriver_win88 (3)\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   driver.get("https://kite.zerodha.com/");
		Kite_login_page1  login1=new Kite_login_page1(driver) ;
		            login1.enterUN();
		            login1.enterPass();
		            login1.clickLogin();
		
		
		Kite_Loginpage2 login2=new Kite_Loginpage2(driver);
		         
		         login2.enterPin();
		         login2.clicContnubuttn();
		
		
		
		Kite_homePage_3 verify=new Kite_homePage_3(driver);
		         verify.verifypage();
		               
   
	}

}
