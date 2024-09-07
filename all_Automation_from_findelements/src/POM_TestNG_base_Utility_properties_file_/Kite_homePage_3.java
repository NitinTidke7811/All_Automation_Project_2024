package POM_TestNG_base_Utility_properties_file_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_homePage_3 {

	@FindBy(xpath="//span[text()='DV1510']") private WebElement prof_id ;
	
	public Kite_homePage_3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public String verifyprofNo() {
		
		
	String actpn= prof_id.getText();
	    return actpn;
	}
	public void Kite_click_onPn() {
		prof_id.click();
	}
	
	
}
