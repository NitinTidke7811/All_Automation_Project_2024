package page_object_module_framework_pom_WDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_homePage_3 {

	@FindBy(xpath="//span[text()='DV1510']") private WebElement prof_id ;
	
	Kite_homePage_3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void verifypage() {
		String act = prof_id.getText();
	      String exp="DV1510";
	      if(act.equals(exp)) {
	    	  System.out.println("test pass");
	      }
	      else {
	    	  System.out.println("test fail");
	      }
	}
	
	
}
