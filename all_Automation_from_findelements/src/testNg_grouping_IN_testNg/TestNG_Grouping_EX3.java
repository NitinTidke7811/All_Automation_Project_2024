package testNg_grouping_IN_testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Grouping_EX3 {
	@Test(groups= {"dashboard"})
	public void tC7() {
		Reporter.log("running tc 7",true);
	}

	
	@Test(groups= {"payment"})
	public void tC8() {
		Reporter.log("running tc 8",true);
	}
	
	@Test(groups= {"dashboard"})
	public void tC9() {
		
		Reporter.log("running tc 9",true);
	}


}
