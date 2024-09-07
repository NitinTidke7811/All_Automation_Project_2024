package test_Ng_designing_test_class;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Keywords 
{
	
	
	@AfterClass    //we can write code at the end or start
	                //it executes according to annotation 
	public void close_Browser1() {
		Reporter.log("_---close chrome browser---",true);
	}


	@BeforeMethod
		public void logintoapp() {
			Reporter.log("---login to application--",true);
			
		}
	@Test(invocationCount=5,priority=1)
	public void verify_ProfNo1(){
		Reporter.log("--verify profile no 1---",true);
	
		}
	@Test(priority=2)
	public void verify_ProfNo2() 
	{
		Reporter.log("---verify profile no 2----",true);
		
	}
	//enabled=false to skip the test case execution.
	//in case of false we can use true for execution.
	@Test(enabled=false,priority=3)
	public void clicOnlogo() 
	{
		Reporter.log("--clic on_logo---");
	}
	
	@Test(priority=4)
	public void _clic_on_serchbox() 
	{
		Reporter.log("---user shoud be able to serch prod----",true);
		
	}
	
	@Test(timeOut=8000,priority=5)
	public void click_on_Cart() throws InterruptedException 
	{
		Thread.sleep(9000);
		Reporter.log("----click on add cart button----",true);
	}
	
	
	
	@AfterMethod
	public void logout_account() 
	{
		Reporter.log("--logout from appplication---",true);
	}
	
	@BeforeClass
	public void open_Browser()
	{
		Reporter.log("--open chrome chrome browser--",true);
	}
	

	
		

	}


