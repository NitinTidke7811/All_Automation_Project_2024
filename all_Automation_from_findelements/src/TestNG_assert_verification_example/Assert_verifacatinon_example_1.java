package TestNG_assert_verification_example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_verifacatinon_example_1 {
	//1.assertNotEquals
	@Test
	public void Verification1()
	{
		String act="nitin";
		String exp="Tidke";
		Assert.assertNotEquals(act, exp, "both result are same");
    }
      //2.assertEquals
	@Test
	public void Verification2()
	{
		String act="nitin";
		String exp="nitin";
		Assert.assertEquals(act, exp, "both result are not same");
    }
	//3.assertTrue
	@Test
	public void Verification3()
	{
		boolean result =true;
		Assert.assertTrue(result, "actual result is false");
    }
   //4.assertFalse
	@Test
	public void Verification4()
	{
		boolean result =false;
		Assert.assertFalse(result, "actual result is true");
    }
	//5.assertNull
	@Test
	public void Verification5()
	{
		String result =null;
		Assert.assertNull(result, "result is not null");
    }
	
     //6.assertNotNull
	@Test
	public void Verification6()
	{
		String result ="nitin";
		Assert.assertNotNull(result, "actual result is null");
    }
	//7.Assert.fail
	@Test
	public void Verification7()
	{
	
		Assert.fail("test case is fail");
    }
	
}
