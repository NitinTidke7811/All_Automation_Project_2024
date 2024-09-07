package test_Ng_designing_test_class;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_suite_Sample1 
{
	@Test(priority=13)
	public void TC1() {
		Reporter.log("----Running tc1-----",true);
	}
	@Test(priority=12)
	public void TC2() {
		Reporter.log("----Running tc2-----",true);
	}
	@Test(priority=11)
	public void TC3() {
		Reporter.log("----Running tc3-----",true);
	}

	

}
