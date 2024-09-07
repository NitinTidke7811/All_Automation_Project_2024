package TestNG_Rerun_failed_test_cases_in_test_suite;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Rerun_Failed_Tc_EX1 {
	@Test
	public void tC1() {
		 Assert.fail("assert fail");
		Reporter.log("running tc 1",true);
	}
	
	@Test
	public void tC2() {
	    
		Reporter.log("running tc 2",true);
	}

	@Test
	public void tC3() {
		Reporter.log("running tc 3",true);
		
	}
}
	//Note:1)inside test output folder "testng-failed.xml" and "emailable html report"  get generate.

	//process to create testng.xml file to run test suite:
	
     //1)right click on one of the test class in test suite-then move mouse to testng option
	//click on convert testng option rename the xml file and click on finish
	//testng.xml file create inside the  project.
	//then open the file and add all test classes in test suite  within package or outside package.
	//by adding package name and class name.like below 
	
	
	//testng.xml file
	//<?xml version="1.0" encoding="UTF-8"?>
	//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	//<suite name="Suite">
	 // <test thread-count="5" name="Test">
	  //  <classes>
	   //   <class name="TestNG_Rerun_failed_test_cases_in_test_suite.TestNG_Rerun_Failed_Tc_EX1"/>
	   //<class name="TestNG_Rerun_failed_test_cases_in_test_suite.TestNG_Rerun_Failed_Tc_EX2"/>
	  // <class name="TestNG_Rerun_failed_test_cases_in_test_suite.TestNG_Rerun_Failed_Tc_EX3"/>
	  //  </classes>
	  //</test> <!-- Test -->
	//</suite> <!-- Suite -->

	

	
	
	



