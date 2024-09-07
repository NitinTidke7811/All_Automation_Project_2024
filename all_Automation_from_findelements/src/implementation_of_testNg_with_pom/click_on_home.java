package implementation_of_testNg_with_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class click_on_home {
	@FindBy(xpath="//span[text()='KV']")private WebElement home;
	
	click_on_home(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickOnHome(){
		home.click();
	}
	

}
