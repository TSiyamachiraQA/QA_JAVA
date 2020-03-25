package com.qa.main;

public class Conditions {

	public int multiplyOrAdd (int firstnum , int secondnum , boolean thirdnum){
		
		if (firstnum % 2 == 0 || secondnum % 2 == 0) {
			System.out.println("Thats an even number!");
			return 0;
		} 
			if (thirdnum == true) {
				return firstnum + secondnum;
			}
			else {
				return firstnum * secondnum;
			}
		}
	}



