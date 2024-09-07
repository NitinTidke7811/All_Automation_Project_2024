package page_object_module_framework_pom_WDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice2_pom_KiteLoginPage2 {

@FindBy(xpath="//input[@id='pin']")private WebElement pin;
@FindBy(xpath="//button[text()='Continue ']")private WebElement continubutton;
practice2_pom_KiteLoginPage2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
	public void setKiteLoginpage2pin() {
		pin.sendKeys("959594");
	}
	public void clicKiteLoginPage2contnubuttn() {
		continubutton.click();
	}
		

	

}
