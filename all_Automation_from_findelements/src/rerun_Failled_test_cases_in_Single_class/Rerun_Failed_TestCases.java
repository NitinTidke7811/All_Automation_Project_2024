package rerun_Failled_test_cases_in_Single_class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Rerun_Failed_TestCases {
	
	@Test
	public void tC1() {
		 
		Reporter.log("running tc 1",true);
	}
	
	@Test
	public void tC2() {
		 Assert.fail();
		Reporter.log("running tc 2",true);
	}

	@Test
	public void tC3() {
		Reporter.log("running tc 3",true);
	}
}
   //note:to re-executes the only failed test cases again we need to
	//use "testng-failed.xml" file
	//1)executes the test class if  one of the tcase get failed then testng-failed.xml file
	//get generate automatically inside project-test output folder
	//open test output folder and click on testng failed.xml file
	//design and source folder open click on source  and after modification of tcase
	//run the failed.xml code
	
	//testng-failed.xml
	//<?xml version="1.0" encoding="UTF-8"?>
	//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	//<suite guice-stage="DEVELOPMENT" name="Failed suite [Failed suite [Default suite]]">
	//  <test thread-count="5" name="Default test(failed)(failed)">
	 //   <classes>
	 //     <class name="TestNG_Rerun_failed_test_cases.TestNG_Rerun_Failed_Tc_EX1">
	  //      <methods>
	   //       <include name="tC1"/>
	   //     </methods>
	   //   </class> <!-- TestNG_Rerun_failed_test_cases.TestNG_Rerun_Failed_Tc_EX1 -->
	  //  </classes>
	 // </test> <!-- Default test(failed)(failed) -->
	//</suite> <!-- Failed suite [Failed suite [Default suite]] -->



