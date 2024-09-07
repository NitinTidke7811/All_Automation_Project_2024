package TestNG_assert_verification_example;

import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assert_verification 

{
	@Test
	public void asert_verification_Test(){
		Reporter.log("running test method",true);
	String act="hiii nitin";
    String exp="hiii priya";
    String exp1="hiii nitin";
    boolean result=false;
    boolean result1=true;
     
    //1.assertNotEquals verification1	 
   Assert.assertNotEquals(act, exp, "both result are same");
    //2.assertNotSame verification2
   Assert.assertNotSame(act, exp, "both are same");
 //3.assertEquals verification3
   Assert.assertEquals(act, exp1, "both are not same");
 //4.assertTrue verification4
   Assert.assertTrue(result, "act result is false");//failed verification
 //5.assertfalse verification5
   Assert.assertFalse(result1, "actual result is true");//disad of hardassert: not executed because 4 verifiation failed already. 
  
   //Note:in hard assert we cant use multiple verification in same test method like above example,
         //because if one of the verification will get fail,complete test method will get failed 
	//and rest of the verification will not get executes.
	//in above example verification 4 is get failed,thats why complete method get failed.
	}
	
    
}
