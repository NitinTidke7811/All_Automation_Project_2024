package automatioin_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_framework_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//step1
		FileInputStream file =new FileInputStream("D:\\automation testing\\automation\\Dec20A.xlsx\\frameworkdata.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver",
		        "E:\\chromedriver_win88 (3)\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  // step2
			   driver.get("https://kite.zerodha.com/");
			    //1.enter UN 
			  String un = sh.getRow(0).getCell(0).getStringCellValue();
			    driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(un);
			    Thread.sleep(2000);
			    //2.enter pass
			    String pass = sh.getRow(0).getCell(1).getStringCellValue();
			    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
			    Thread.sleep(2000);
			    //click login
			    
			    driver.findElement(By.xpath("//button[@type='submit']")).click();
			   Thread.sleep(2000);
			    //enter pin
			    String pin = sh.getRow(0).getCell(2).getStringCellValue();
			    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
			  Thread.sleep(2000);
			    //click on continue
			    driver.findElement(By.xpath("//button[@type='submit']")).click();
			  //step3
			     String expun = sh.getRow(0).getCell(0).getStringCellValue();
			        String actun = driver.findElement(By.xpath("//span[text()='DV1510']")).getText();
			   
			    	if(expun.equals(actun)) {
			    		System.out.println("pass");
			    		
			    	}
			    	else {
			    		System.out.println("fail");
			    	}
			    	

	}

}
