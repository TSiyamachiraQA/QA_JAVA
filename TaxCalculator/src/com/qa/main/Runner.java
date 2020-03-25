package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Calculator test = new Calculator();
		System.out.println(test.userName("James"));
		test.salary(50000);
		System.out.println(test.taxCategory());
		

	}

}
