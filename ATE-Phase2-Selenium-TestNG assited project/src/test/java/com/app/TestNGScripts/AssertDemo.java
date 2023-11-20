package com.app.TestNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	@Test
	public void method1() {
		
		String expectedresult ="Selenium";
		String actualresult ="SeleniumTest";
		
		// assertNotEquals : it will check if 2 strings are not equal => true => Pass
		// return false = test stops --> assertion error
		Assert.assertNotEquals(expectedresult,actualresult);
		
	}
	
	@Test
	public void method2(){
		
		String actualresult = null;
		
		Assert.assertNotNull(actualresult);
		
	}
	
	@Test
	public void method3() {
		
		String actualresult = null;
		
		Assert.assertNull(actualresult);
	}

}
