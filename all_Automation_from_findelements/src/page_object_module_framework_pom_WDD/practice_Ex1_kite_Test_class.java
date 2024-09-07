package page_object_module_framework_pom_WDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_Ex1_kite_Test_class {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
	 "E:\\chromedriver_win88 (3)\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 practice_Kite_loginpage1 login1=new practice_Kite_loginpage1(driver);
	  login1.enter_Un();
	  login1.enterPass();
	  login1.clicklogin_btn();
	 
	 
	 
	 practice1_POm_kite_LoginPage2 login2=new practice1_POm_kite_LoginPage2(driver);
	 login2.enterpin();
	 login2.clickContnubtn();
	 
	 
	 
	 practice1_VerifyHomePageKite verifypfid=new practice1_VerifyHomePageKite(driver);
	 
	 verifypfid.verify_Pf_Id();
	 
	 driver.navigate().back();
	 driver.get("https://kite.zerodha.com/dashboard");
	 driver.switchTo().alert().accept();
	}

}
