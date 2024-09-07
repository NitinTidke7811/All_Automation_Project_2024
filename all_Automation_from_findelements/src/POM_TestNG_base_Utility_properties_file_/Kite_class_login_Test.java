package POM_TestNG_base_Utility_properties_file_;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_class_login_Test extends Base {
	
	Kite_login_page1  login1;
	Kite_Loginpage2 login2;
	Kite_homePage_3 verify;
	click_on_home home;
	Kite_Logout logout;
	int TCID;
	
	
	
	
@BeforeClass
public void openBrowser() throws IOException {
 browserOpen();

login1=new Kite_login_page1(driver) ;
login2=new Kite_Loginpage2(driver);
verify=new Kite_homePage_3(driver);
//home=new click_on_home(driver);
logout=new Kite_Logout(driver);

}
@BeforeMethod
public void KiteloginPage1() throws EncryptedDocumentException, IOException {

    login1.enterUN(Utility.getTD(0, 0));
     
    login1.enterPass(Utility.getTD(0, 1));
    login1.clickLogin();
    
    login2.enterPin(Utility.getTD(0, 2));
	login2.clicContnubuttn();
	
    
    
	}
@Test
public void verify_profile() throws EncryptedDocumentException, IOException {
TCID=200;
String actpn = verify.verifyprofNo(); 
String expected = Utility.getTD(0, 3);
System.out.println("actpn :"+actpn);
System.out.println("exppn: "+expected);
Assert.assertEquals(actpn, expected,"actpn and exppn are different");
Utility.captureScreenshot(driver, TCID);
}
@AfterMethod
public void logout_from_kite()  

{

	
	verify.Kite_click_onPn();
	logout.kiteLogout();
}
@AfterClass	
public void close_browser() throws InterruptedException {
	Thread.sleep(4000);
	driver.close();

}

	
	
	

	
}
