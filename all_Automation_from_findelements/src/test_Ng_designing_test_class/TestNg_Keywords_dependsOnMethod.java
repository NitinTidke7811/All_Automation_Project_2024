package test_Ng_designing_test_class;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Keywords_dependsOnMethod 
{
	@Test()
	public void enterValid_UN() 
	{
		Reporter.log("----enter valid UN---",true);
	}
	@Test(timeOut=8000)
	public void enter_Valid_Pass() throws InterruptedException 
	{
		Thread.sleep(9000);//required time for execution of this method is 9 seconds
		                   //but timeout statement stop execution after 8 min and skip this methd so this methd get fail.
		Reporter.log("---enter Valid_UN----",true);
	}
	@Test(dependsOnMethods= {"enterValid_UN","enter_Valid_Pass"})
	public void verifyProf()//this method depend on above 2 method 
	{                        //if one of the method above get fail then this method skip automatically 
		Reporter.log("--verify_profile_No----");
	}
	
		
}
