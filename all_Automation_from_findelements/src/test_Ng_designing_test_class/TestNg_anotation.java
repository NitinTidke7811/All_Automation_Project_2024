package test_Ng_designing_test_class;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNg_anotation {
	
	@AfterClass
	public void open_Browser() {
		Reporter.log("_---close chrome browser---",true);
	}


	@BeforeMethod
		public void logintoapp() {
			Reporter.log("---login to application--",true);
			
		}
	@Test
	public void verify_ProfNo1(){
		Reporter.log("--verify profile no 1---",true);
	
		}
	@Test
	public void verify_ProfNo2() {
		Reporter.log("---verify profile no 2----",true);
		
	}
	@Test
	public void _clic_on_serchbox() {
		Reporter.log("---user shoud be able to serch prod----",true);
		
		
	}
	
	@AfterMethod
	public void logout_account() {
		Reporter.log("--logout from appplication---",true);
	}
	@BeforeClass
	public void close_Browser() {
		Reporter.log("--open chrome chrome browser--",true);
	}
	

	}



