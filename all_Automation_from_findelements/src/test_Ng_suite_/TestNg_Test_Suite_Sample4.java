package test_Ng_suite_;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Test_Suite_Sample4 {
	@Test(priority=4)
	public void Tc10() {
		Reporter.log("----runnig tc 10----",true);
	}
	@Test(priority=3)
	public void Tc11() {
		Reporter.log("----runnig tc 11----",true);
	}

}
