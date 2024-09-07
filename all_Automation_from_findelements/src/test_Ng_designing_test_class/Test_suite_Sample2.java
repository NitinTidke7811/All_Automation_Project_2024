package test_Ng_designing_test_class;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_suite_Sample2 {
@Test(priority=10)
public void TC4() 
{
	Reporter.log("----Running tc4-----",true);
}
@Test(priority=9)
public void TC5() {
	Reporter.log("----Running tc5-----",true);
}
@Test(priority=8)
public void TC6() {
	Reporter.log("----Running tc6-----",true);
}
	
}
