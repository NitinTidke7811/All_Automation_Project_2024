package page_object_module_framework_pom_WDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice1_VerifyHomePageKite {
	@FindBy(xpath="//span[text()='DV1510']")private WebElement homePfid;
	practice1_VerifyHomePageKite(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void verify_Pf_Id() {
		String Expunid="DV1510";
		String actunid = homePfid.getText();
		if(actunid.equals(Expunid)) 
		{
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		
	}
}
