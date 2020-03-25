package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		NumbersCalculator calculator = new NumbersCalculator();
		System.out.println(calculator.simpleNumbers(9, 69));
		System.out.println(calculator.bigNumbers(2, 800));
		System.out.println(calculator.biggerNumbers(20, 5000));

	}

}
