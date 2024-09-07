package POM_TestNG_base_Utility_properties_file_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Logout 
{
	
@FindBy(xpath="//a[text()=' Logout']")private WebElement logout;
	
   public Kite_Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void kiteLogout()
	{
	   
		logout.click();
	}
	
	

}

	


