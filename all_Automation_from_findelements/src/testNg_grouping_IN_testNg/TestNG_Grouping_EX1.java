package testNg_grouping_IN_testNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Grouping_EX1 {
	@Test(groups= {"dashboard"})
	public void tC1() {
		 Assert.fail("assert fail");
		Reporter.log("running tc 1",true);
	}
	
	@Test(groups= {"payment"})
	public void tC2() {
	    
		Reporter.log("running tc 2",true);
	}

	@Test(groups= {"order"})
	public void tC3() {
		Reporter.log("running tc 3",true);
		
	}
}
//1.testng_suite_execution_code.xml

//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
 // <test thread-count="5" name="Test">
  //  <classes>
   //   <class name="testNg_grouping_IN_testNg.TestNG_Grouping_EX1"/>
   //   <class name="testNg_grouping_IN_testNg.TestNG_grouping__EX2"/>
       //<class name="testNg_grouping_IN_testNg.TestNG_Grouping_EX3"/>
   // </classes>
  //</test> <!-- Test -->
//</suite> <!-- Suite -->

//executes by groups. like.modulewise execution order,payment,profile .etc
	
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
 // <test thread-count="5" name="Test">
 // <groups>
 // <run>
  
 // <exclude name="payment"/>
//<exclude name="dashboard"/>
//or
//<include name="payment"/>
//<include name="dashboard"/>
  //
 // </run>
 // </groups>
  //  <classes>
  //    <class name="testNg_grouping_IN_testNg.TestNG_Grouping_EX1"/>
   //   <class name="testNg_grouping_IN_testNg.TestNG_grouping__EX2"/>
   //    <class name="testNg_grouping_IN_testNg.TestNG_Grouping_EX3"/>
   // </classes>
 // </test> <!-- Test -->
//</suite> <!-- Suite -->

	



