package pom_datadriven_framework_Kite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_class_login_Test {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Tidke\\Eclipse workspsce\\all_Automation_from_findelements\\TestData\\frameworkdata.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver",
	   "C:\\\\Users\\\\Tidke\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://kite.zerodha.com/");
		Kite_login_page1  login1=new Kite_login_page1(driver) ;
	   String un = sh.getRow(0).getCell(0).getStringCellValue();
       login1.enterUN(un);
       
       String pass = sh.getRow(0).getCell(1).getStringCellValue();  
       login1.enterPass(pass);
       login1.clickLogin();
		
		
		Kite_Loginpage2 login2=new Kite_Loginpage2(driver);
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
	    login2.enterPin(pin);
		login2.clicContnubuttn();
		
		
		
		Kite_homePage_3 verify=new Kite_homePage_3(driver);
		String profno = sh.getRow(0).getCell(2).getStringCellValue();   
		verify.verifypage(profno);
		               
   
	}

}
