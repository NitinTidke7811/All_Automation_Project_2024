package test_Ng_suite_;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Test_Suite_Sample5 {
	@Test(priority=2)
	public void Tc12() {
		Reporter.log("----runnig tc 12----",true);
	}
	@Test(priority=1)
	public void Tc13() {
		Reporter.log("----runnig tc 13----",true);
	}

}
