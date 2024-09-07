package TestNG_Disable_suites_methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_disable_Testsuite_Tc_EX2 {
	@Test
	public void tC5() {
		Reporter.log("running tc 5",true);
	}

	
	@Test
	public void tC6() {
		Reporter.log("running tc 6",true);
	}
	
	@Test
	public void tC7() {
		Assert.fail("assert fail");
		Reporter.log("running tc 7",true);
	}


}
