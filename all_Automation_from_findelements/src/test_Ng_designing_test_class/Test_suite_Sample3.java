package test_Ng_designing_test_class;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_suite_Sample3
{
	@Test(priority=7)
	public void TC7() {
		Reporter.log("----Running tc7-----",true);
	}
	@Test(priority=6)
	public void TC8() {
		Reporter.log("----Running tc8-----",true);
	}
	@Test(priority=5)
	public void TC9() {
		Reporter.log("----Running tc9-----",true);
	}
	
}
