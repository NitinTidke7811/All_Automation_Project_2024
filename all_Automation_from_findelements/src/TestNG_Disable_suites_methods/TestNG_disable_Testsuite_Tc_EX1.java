package TestNG_Disable_suites_methods;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_disable_Testsuite_Tc_EX1
{
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
//Note:also reffer test class ex2 for tc5,tc6.tc7

//1.exclude:by using exclude excluded method will not get executes.ex.only tc2 and tc7 will not get executes. 
//2.include:by using include only included test case  cases get executes.ex.only tc2 and tc7 will get executes.
//
//1.exclude example
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
 // <test thread-count="5" name="Test">
   // <classes>
   //   <class name="TestNG_Disable_suites_methods.TestNG_disable_Testsuite_Tc_EX1"/>
   //   <methods>
   //   <exclude name="tC1"/>
   //   </methods>
   //   <class name="TestNG_Disable_suites_methods.TestNG_disable_Testsuite_Tc_EX2"/>
  //  <methods>
  //  <exclude name="tC7"/>
  //  </methods>
   // </classes>
  //</test> <!-- Test -->
//</suite> <!-- Suite -->
//.
//2.include example
//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
// <test thread-count="5" name="Test">
 // <classes>
 //   <class name="TestNG_Disable_suites_methods.TestNG_disable_Testsuite_Tc_EX1"/>
 //   <methods>
 //   <include name="tC1"/>
 //   </methods>
 //   <class name="TestNG_Disable_suites_methods.TestNG_disable_Testsuite_Tc_EX2"/>
//  <methods>
//  <include name="tC7"/>
//  </methods>
 // </classes>
//</test> <!-- Test -->
//</suite> <!-- Suite -->

