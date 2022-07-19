package com.practice.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeMethodsTest {
	
	@Test
	public void testngTest() {
		Reporter.log("this is first testng test",true);
	}
	
	@Test
	public void testngTest2() {
		Reporter.log("this is second testng test", true);
	}

}
