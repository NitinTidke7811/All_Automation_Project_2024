package pom_testNg_DDF_Base_and_Utility_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Logout 
{
	
@FindBy(xpath="//a[text()=' Logout']")private WebElement logout;
	
    Kite_Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void kiteLogout()
	{
	   
		logout.click();
	}
	
	

}

	


