package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		int salary = 30000;
		TaxCalculator calculator = new TaxCalculator();
		System.out.println(calculator.taxCal(salary));
		System.out.println(calculator.taxPaid(salary));
	}

}
