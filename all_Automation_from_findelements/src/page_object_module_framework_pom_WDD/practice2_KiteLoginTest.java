package page_object_module_framework_pom_WDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice2_KiteLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
"E:\\chromedriver_win88 (3)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
 WebDriver driver = new ChromeDriver(options);
 driver.get("https://kite.zerodha.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 practice_2Pom_kiteLoging1Page kitelogin1 =new practice_2Pom_kiteLoging1Page(driver);
 kitelogin1.setKiteLogin1PageUN();
 kitelogin1.setKiteLogin1Pagepass();
 kitelogin1.clickKiteLoginPage1loginButton();
 
 
 
 
 practice2_pom_KiteLoginPage2 kitelogin2=new practice2_pom_KiteLoginPage2(driver);
 kitelogin2.setKiteLoginpage2pin();
 kitelogin2.clicKiteLoginPage2contnubuttn();
 
 
 practice2_VerifyKiteHomePage  verfy =new practice2_VerifyKiteHomePage (driver);
 verfy.verifyProfId();
 verfy.clickpf();
 verfy.clicklogoutbtn();
	}

}
