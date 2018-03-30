package com.calculator;

import javax.swing.JOptionPane;

public class CalculatroApp {

	public static void main(String args[]) {

		int x, y;
		String sX, sY;

		sX = JOptionPane.showInputDialog(null, "Digite o primeiro n�mero:", "Primeiro n�mero", JOptionPane.QUESTION_MESSAGE);
		x = Integer.parseInt(sX);
		sY = JOptionPane.showInputDialog(null, "Digite o segundo n�mero:", "Segundo n�mero", JOptionPane.QUESTION_MESSAGE);
		y = Integer.parseInt(sY);

		// instancia��o de um objeto da classe calculadora
		Calculator calc = new Calculator();

		JOptionPane.showMessageDialog(null, "somar: " + calc.sum(x, y));
		JOptionPane.showMessageDialog(null, "subtrair: " + calc.subtract(x, y));
		JOptionPane.showMessageDialog(null, "multiplicar: " + calc.multiply(x, y));
		JOptionPane.showMessageDialog(null, "dividir: " + calc.divide(x, y));

		System.exit(0);
	}
	
}