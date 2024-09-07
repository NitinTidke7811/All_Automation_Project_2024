package testNg_grouping_IN_testNg;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_grouping__EX2
{
	@Test(groups= {"order"})
	public void tC4() {
		
		Reporter.log("running tc 4",true);
	}
	
	@Test(groups= {"profile"})
	public void tC5() {
		Reporter.log("running tc 5",true);
	}
	
	@Test(groups= {"order"})
	public void tC6() {
		
		Reporter.log("running tc 6",true);
	}
	
	
	

}
