package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

	Calculator calculator = new Calculator();
	
	@Test
	public void testAdd() {
		
		int a = 5;
		int b = 7;
		
		int result = calculator.add(a, b);
		
		//Assert
		
		Assert.assertEquals(result,12,"Addition result is failed");
	}
	
	@Test
	public void testSub() {
		
		int c = 5;
		int d = 7;
		
		int result = calculator.sub(c, d);
		
		//Assert
		
		Assert.assertEquals(result,1);
	}
	
	
}
