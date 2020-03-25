package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Conditions Condition = new Conditions();
		int test = Condition.multiplyOrAdd(3, 22, true);
		System.out.println(test);
		
	}
}