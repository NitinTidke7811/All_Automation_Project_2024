package implementation_of_testNg_with_pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_class_login_Test {
	
	Kite_login_page1  login1;
	Kite_Loginpage2 login2;
	Kite_homePage_3 verify;
	click_on_home home;
	Kite_Logout logout;
	WebDriver driver;
	Sheet sh;
	FileInputStream file;
	
@BeforeClass
public void open_browser() throws EncryptedDocumentException, IOException {
file=new FileInputStream("D:\\automation testing\\automation\\Dec20A.xlsx\\frameworkdata.xlsx");
sh = WorkbookFactory.create(file).getSheet("DDF");
        System.setProperty("webdriver.chrome.driver",
       "E:\\chromedriver_win88 (3)\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://kite.zerodha.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

login1=new Kite_login_page1(driver) ;
login2=new Kite_Loginpage2(driver);
verify=new Kite_homePage_3(driver);
home=new click_on_home(driver);
logout=new Kite_Logout(driver);

}
@BeforeMethod
public void KiteloginPage1() {
	String un = sh.getRow(0).getCell(0).getStringCellValue();
    login1.enterUN(un);
    String pass = sh.getRow(0).getCell(1).getStringCellValue();  
    login1.enterPass(pass);
    login1.clickLogin();
    String pin = sh.getRow(0).getCell(2).getStringCellValue();
    login2.enterPin(pin);
	login2.clicContnubuttn();
    
    
	}
@Test
public void verify_profile() {
String actpn = verify.verifyprofNo(); 
String expected = sh.getRow(0).getCell(3).getStringCellValue();
System.out.println("actpn :"+actpn);
System.out.println("exppn: "+expected);
Assert.assertEquals(actpn, expected,"actpn and exppn are different");
}
@AfterMethod
public void logout_from_kite() 
{
	home.clickOnHome();
	logout.kiteLogout();
}
@AfterClass	
public void close_browser() throws InterruptedException {
	Thread.sleep(5000);
	driver.close();
}
	
	
	

	
}
