package implementation_of_testNg_with_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_homePage_3 {

	@FindBy(xpath="//span[text()='DV1510']") private WebElement prof_id ;
	
	Kite_homePage_3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public String verifyprofNo() {
		
		
	String actpn= prof_id.getText();
	    return actpn;
	}
	
	
}
