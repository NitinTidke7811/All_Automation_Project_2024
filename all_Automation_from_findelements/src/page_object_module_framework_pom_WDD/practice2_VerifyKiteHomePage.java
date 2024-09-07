package page_object_module_framework_pom_WDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice2_VerifyKiteHomePage 
{
	@FindBy(xpath="//span[@class='user-id']")private WebElement ProfNo;
	@FindBy(xpath="//a[text()=' Logout']")private WebElement pflogout;
	practice2_VerifyKiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyProfId()
	{
       String actpfNo = ProfNo.getText();
       String exppfid = "DV1510";
       if(actpfNo.equals(exppfid)) {
    	   System.out.println("test pass");
       }
       else
       {
    	   System.out.println("test faiL");
       }
	}
	public void clickpf() {
		ProfNo.click();
		
	}
	public void clicklogoutbtn() {
		pflogout.click();
	}
	
	
}

