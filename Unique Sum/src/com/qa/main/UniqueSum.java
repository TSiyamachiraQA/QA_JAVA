package com.qa.main;

public class UniqueSum {
	public int anotherGame(int firstnum , int secondnum , int thirdnum) {
		
		if (firstnum == secondnum) {
			return firstnum - secondnum + thirdnum;
		}
		else if(firstnum == thirdnum) {
			return firstnum - thirdnum + secondnum;
		}
		else {
			return firstnum + secondnum + thirdnum;	
		}
	}

}
