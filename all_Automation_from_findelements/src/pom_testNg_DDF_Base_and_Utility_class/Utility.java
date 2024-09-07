package pom_testNg_DDF_Base_and_Utility_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
public static String getTD(int rowindex,int collmindex) throws EncryptedDocumentException, IOException {
		FileInputStream	file=new FileInputStream("C:\\Users\\NITIN\\eclipse-workspace\\all_Automation_from_findelements\\TestData\\frameworkdata.xlsx");
	    Sheet sh = WorkbookFactory.create(file).getSheet("DDF");	
		String value=sh.getRow(rowindex).getCell(collmindex).getStringCellValue();
	    return value;
	}
	
	public static void captureScreenshot(WebDriver driver,int TCID) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\NITIN\\eclipse-workspace\\all_Automation_from_findelements\\Screensho"+TCID+".jpg");
	    FileHandler.copy(source, dest);
	
	}
	

}
