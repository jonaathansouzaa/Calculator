package com.calculator;

public class Calculator {

	private double result = 0;

	public double sum(double value1, double value2) {
		result = value1 + value2;
		return result;
	}

	public double subtract(double value1, double value2) {
		result = value1 - value2;
		return result;
	}

	public double multiply(double value1, double value2) {
		result = value1 * value2;
		return result;
	}

	public double divide(double value1, double value2) {
		if (value2 == 0) 
			throw new NumberFormatException();
		result = value1 / value2;
		return result;
	}

}