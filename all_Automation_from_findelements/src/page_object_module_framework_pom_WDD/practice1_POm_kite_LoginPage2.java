package page_object_module_framework_pom_WDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice1_POm_kite_LoginPage2 {
	
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[text()='Continue ']")private WebElement contnu_btn;
	
	practice1_POm_kite_LoginPage2(WebDriver driver){
		PageFactory.initElements(driver,this );
	}
	public void enterpin() {
		pin.sendKeys("959594");
	}
	public void clickContnubtn() {
		contnu_btn.click();
	}

}
