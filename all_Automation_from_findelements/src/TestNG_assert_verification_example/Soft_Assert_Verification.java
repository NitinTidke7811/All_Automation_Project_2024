package TestNG_assert_verification_example;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Verification {
	SoftAssert soft=new SoftAssert();
@Test
public void softAssert_verification() 

{
	String act="nitin";
	String exp="priya";
	
	

	boolean result=false;
	SoftAssert soft=new SoftAssert();
	//1.Verification1
	soft.assertNotEquals(act, exp,"both are not diifferent" );
	//2.Verification2
	soft.assertEquals(act, exp,"both are not same" );
	//3.Verification3
	soft.assertTrue(result, "actual result is false");
	//1.Verification4
	soft.assertNotEquals(act, exp,"both are not diifferent" );
	
        soft.assertAll("test failed");
        //Note :if we are not use assertAll then test method will get pass 
        //but it may be some verification will get failed and it is skipped during execution
        //it is not possible to  find  wich verification is get failed without assert all.
        //after failed verification  rest of the verification also will get executes by using SoftAssert class i.e adv of soft assert
	
	 
  
  
  
}

}
