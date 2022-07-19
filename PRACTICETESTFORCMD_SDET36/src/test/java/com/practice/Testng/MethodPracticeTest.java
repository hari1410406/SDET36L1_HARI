package com.practice.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class MethodPracticeTest {
	
	@Test
	public void allTestngTests() {
		Reporter.log("this is test class 2", true);
		//Harish changed this one
	}
	
	@Test
	public void allTest() {
		Reporter.log("this is another method",true);
		//this change for pull request
	}

}
