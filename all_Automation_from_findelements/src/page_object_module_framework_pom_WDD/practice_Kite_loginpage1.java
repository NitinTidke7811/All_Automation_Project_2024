package page_object_module_framework_pom_WDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice_Kite_loginpage1 
{
	
	@FindBy(xpath="//input[@id='userid']")private WebElement un;
	
	@FindBy(xpath="//input[@id='password']")private WebElement pass;
	
	@FindBy(xpath="//button[text()='Login ']")private WebElement login;
	
	practice_Kite_loginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enter_Un() 
	{
		un.sendKeys("DV1510");
	}
	public void enterPass()
	{
		pass.sendKeys("Vijay@123");
	}
	public void clicklogin_btn()
	{
		login.click();
	}
	
	
	

}
