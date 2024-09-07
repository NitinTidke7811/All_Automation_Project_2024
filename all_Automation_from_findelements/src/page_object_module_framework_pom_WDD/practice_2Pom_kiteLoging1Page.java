package page_object_module_framework_pom_WDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice_2Pom_kiteLoging1Page {
@FindBy(xpath="//input[@id='userid']")private WebElement un;
@FindBy(xpath="//input[@type='password']")private WebElement pass;
@FindBy(xpath="//button[@type='submit']")private WebElement login;
practice_2Pom_kiteLoging1Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void setKiteLogin1PageUN() {
	un.sendKeys("DV1510");
}
public void setKiteLogin1Pagepass() {
	pass.sendKeys("Vijay@123");
}
public void clickKiteLoginPage1loginButton() {
	login.click();
	
}
	
	
	
	
	
	
	
	
	
	
}
