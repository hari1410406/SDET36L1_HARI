package com.practice.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngPackagesTest {
	
	@Test
	public void buildMethod() {
		Reporter.log("this is build1",true);
		//this is build PUll Request
		
	}
	@Test
	public void packageMethod() {
		Reporter.log("This is package",true);
	}

}
