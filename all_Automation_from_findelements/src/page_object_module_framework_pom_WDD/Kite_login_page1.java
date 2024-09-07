package page_object_module_framework_pom_WDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_login_page1 {
    //step1 declare d.m globally
	@FindBy(xpath="//input[@id='userid']")private WebElement un;
	@FindBy(xpath="//input[@id='password']")private WebElement pass;
	@FindBy(xpath="//button[text()='Login ']") private WebElement login;
	Kite_login_page1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		public void enterUN() 
		{
			un.sendKeys("DV1510");
		}
	     public void enterPass()
	     {
	    	 pass.sendKeys("Vijay@123");
	     }
	    public void clickLogin() 
	    {
	    	login.click();
	    }
	

	

	

}
