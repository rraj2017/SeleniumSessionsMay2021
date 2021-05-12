package com.angularexample.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CalculatorPage;

public class CalculatorTest {
	CalculatorPage calcPage;
	@BeforeTest
	public void setup() {
		calcPage =new CalculatorPage();
		
		
	}
	
	@Test(priority =1)
	public void sumTest() {
		String res = calcPage.doSum("10","20");
		Assert.assertEquals(res, "30");
		
	}
	@Test(priority =2)
	public void subest() {
		String res = calcPage.doSub("100","80");
		Assert.assertEquals(res, "20");
		
	}
	
	@Test(priority =3)
	public void divTest() {
		String res = calcPage.doDiv("20","2");
		Assert.assertEquals(res, "10");
		
	}
	

}
