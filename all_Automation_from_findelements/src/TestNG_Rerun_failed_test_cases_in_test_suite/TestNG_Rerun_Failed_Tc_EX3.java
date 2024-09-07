package TestNG_Rerun_failed_test_cases_in_test_suite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Rerun_Failed_Tc_EX3 {
	@Test
	public void tC7() {
		Reporter.log("running tc 7",true);
	}

	
	@Test
	public void tC8() {
		Reporter.log("running tc 8",true);
	}
	
	@Test
	public void tC9() {
		Assert.fail("assert fail");
		Reporter.log("running tc 9",true);
	}


}
