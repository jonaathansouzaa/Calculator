package com.calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CalculatorTest extends TestCase {

	private Calculator app;
	
	public CalculatorTest(String testName) {
		super(testName);
		app = new Calculator();
	}

	public static Test suite() {
		return new TestSuite(CalculatorTest.class);
	}

	public void testSumWithIntNumbers() {
		int value1 = 3;
		int value2 = 8;
		assertEquals(11.0, app.sum(value1, value2));
	}
	
	public void testSumWithBrokenNumbers() {
		double value1 = 7.7;
		double value2 = 9.5;
		assertEquals(17.2, app.sum(value1, value2));
	}
	
	public void testSumWithNegativeNumbers() {
		int value1 = -7;
		int value2 = -5;
		assertEquals(-12.0, app.sum(value1, value2));
	}

	public void testSubtractWithIntNumbers() {
		int value1 = 8;
		int value2 = 5;
		assertEquals(3.0, app.subtract(value1, value2));
	}
	
	public void testSubtractWithBrokenNumbers() {
		double value1 = 9.5;
		double value2 = 5.3;
		assertEquals(4.2, app.subtract(value1, value2));
	}

	public void testSubtractWithNegativeNumbers() {
		int value1 = -7;
		int value2 = -5;
		assertEquals(-2.0, app.subtract(value1, value2));
	}

	public void testMultiplyWithIntNumbers() {
		int value1 = 6;
		int value2 = 5;
		assertEquals(30.0, app.multiply(value1, value2));
	}
	
	public void testMultiplyWithBrokenNumbers() {
		double value1 = 5.5;
		double value2 = 6.7;
		assertEquals(36.85, app.multiply(value1, value2));
	}
	
	public void testMultiplyWithNegativeNumbers() {
		int value1 = -7;
		int value2 = -5;
		assertEquals(35.0, app.multiply(value1, value2));
	}

	public void testDivideWithIntNumbers() {
		int value1 = 30;
		int value2 = 5;
		assertEquals(6.0, app.divide(value1, value2));
	}
	
	public void testDivideWithBrokenNumbers() {
		double value1 = 25.9;
		double value2 = 5.5;
		assertEquals(4.709090909090909, app.divide(value1, value2));
	}
	
	public void testDivideWithNegativeNumbers() {
		int value1 = -20;
		int value2 = -5;
		assertEquals(4.0, app.divide(value1, value2));
	}
	
}
