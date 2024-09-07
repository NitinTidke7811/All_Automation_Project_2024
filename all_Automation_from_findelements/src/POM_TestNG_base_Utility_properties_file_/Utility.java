package POM_TestNG_base_Utility_properties_file_;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
public static String getTD(int rowindex,int collmindex) throws EncryptedDocumentException, IOException {
		FileInputStream	file=new FileInputStream("\"C:\\Users\\Tidke\\frameworkdata.xlsx\"");
	    Sheet sh = WorkbookFactory.create(file).getSheet("DDF");	
		String value=sh.getRow(rowindex).getCell(collmindex).getStringCellValue();
	    return value;
	}
	
	public static void captureScreenshot(WebDriver driver,int TCID) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\NITIN\\eclipse-workspace\\all_Automation_from_findelements\\Screenshot\\Screenshot_"+TCID+".jpg");
	    FileHandler.copy(source, dest);
	
	}
	public static String getPropertyFileData(String key) throws IOException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\abcd.proprties");
		obj.load(objfile);
		String value = obj.getProperty(key);
//above method uses in base class.to open webpage.
		return value;
	}
	

}
