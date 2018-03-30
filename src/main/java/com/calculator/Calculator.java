package com.calculator;

public class Calculator {

	private double result = 0;

	public double sum(double value1, double value2) {
		result = value1 + value2;
		return result;
	}

	public double subtract(int value1, int value2) {
		result = value1 - value2;
		return result;
	}

	public double multiply(int value1, int value2) {
		result = value1 * value2;
		return result;
	}

	public double divide(int value1, int value2) {
		result = value1 / value2;
		return result;
	}

}