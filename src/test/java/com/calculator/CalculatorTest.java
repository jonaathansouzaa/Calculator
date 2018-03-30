package com.calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalculatorTest extends TestCase {
	
	public CalculatorTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(CalculatorTest.class);
	}

	public void testSumWithIntNumbers() {
		int value1 = 3;
		int value2 = 8;
		
		Calculator app = new Calculator();
		assertEquals(11.0, app.sum(value1, value2));
	}
	
	public void testSumWithBrokenNumbers() {
		double value1 = 7.7;
		double value2 = 9.5;
		
		Calculator app = new Calculator();
		assertEquals(17.2, app.sum(value1, value2));
	}
	
	public void testSumWithNegativeNumbers() {
		int value1 = -7;
		int value2 = -5;
		
		Calculator app = new Calculator();
		assertEquals(-12.0, app.sum(value1, value2));
	}
	
}
