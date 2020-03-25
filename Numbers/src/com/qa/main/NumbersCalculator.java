package com.qa.main;

public class NumbersCalculator {
	
	public int simpleNumbers(int number1 , int number2) {
		if (number1 >=10 && number1 <=99 && number2 >=10 && number2 <=99) {
			return number1 + number2;
		}
		else {
			return 0;
		}

	}

	public int bigNumbers(int number1 , int number2) {
		if (number1 >=1 && number1 <=999 && number2 >=1 && number2 <=999) {
			return number1 + number2;
		}
		else {
			return 0;
		}
	
	}
	
	public int biggerNumbers(int number1 , int number2) {
		if (number1 >=1 && number1 <=9999 && number2 >=1 && number2 <=9999) {
			return number1 + number2;
		}
		else {
			return 0;
		}
	
	}
}