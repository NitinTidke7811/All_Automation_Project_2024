package automatioin_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkEX2_Data_driven_Framework_DDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("D:\\automation testing\\automation\\Dec20A.xlsx\\frameworkdata.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		System.setProperty("webdriver.chrome.driver",
	   "E:\\chromedriver_win88 (3)\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("https://kite.zerodha.com/");
	   Thread.sleep(2000);
	   //1.Enter Userid
	  String un = sh.getRow(0).getCell(0).getStringCellValue();
	   driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
	   Thread.sleep(2000);
	   
	   // 2.enter pass
	   String pass = sh.getRow(0).getCell(1).getStringCellValue();
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	   Thread.sleep(2000);
	   //3.click on login 
	   driver.findElement(By.xpath("//button[text()='Login ']")).click();
	   Thread.sleep(2000);
	   //4.enter pin
	   String pin = sh.getRow(0).getCell(2).getStringCellValue();
	   driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	   Thread.sleep(2000);
	   //5.click on continue buton
	   driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	   String actun = driver.findElement(By.xpath("//span[text()='DV1510']")).getText();
	   
	   String expun = sh.getRow(0).getCell(0).getStringCellValue();
	   if(actun.equals(expun)) {
		   System.out.println("pass");
	   }
	   else {
		   System.out.println("fail");
	   }
	   
	   
	   
		
		

	}

}
