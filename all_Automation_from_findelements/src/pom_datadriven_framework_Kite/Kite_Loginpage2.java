package pom_datadriven_framework_Kite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Loginpage2 {
	
	@FindBy(xpath="//input[@id='password']") private WebElement pin;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement contnubuttn;
	Kite_Loginpage2(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	public void enterPin(String setpin) {
		pin.sendKeys(setpin);
	}
	public void clicContnubuttn() {
		contnubuttn.click();
	}
	
}