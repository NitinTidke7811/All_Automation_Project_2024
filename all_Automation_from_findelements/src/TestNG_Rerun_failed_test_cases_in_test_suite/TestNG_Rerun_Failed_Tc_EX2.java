package TestNG_Rerun_failed_test_cases_in_test_suite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Rerun_Failed_Tc_EX2 
{
	@Test
	public void tC4() {
		Assert.fail("assert fail");
		Reporter.log("running tc 4",true);
	}
	
	@Test
	public void tC5() {
		Reporter.log("running tc 5",true);
	}
	
	@Test
	public void tC6() {
		Assert.fail("assert fail");
		Reporter.log("running tc 6",true);
	}
	
	
	

}
