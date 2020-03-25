package com.qa.main;

public class BlackJackGame {
	public int game( int firstcard, int secondcard) {
		int differenceInFirstCard = 21 - firstcard;
		int differenceInSecondCard = 21 - secondcard;
		
		if (differenceInFirstCard < 0 && differenceInSecondCard < 0) {
			return 0;
		}
		else if(differenceInFirstCard > 0 && differenceInSecondCard < 0) {
			return firstcard;
		}
		else if(differenceInFirstCard < 0 && differenceInSecondCard > 0) {
			return secondcard;
		}
		else {
			if (differenceInFirstCard < differenceInSecondCard) {
				return firstcard;
			}
			else {
				return secondcard;
			}
		}
	}
	

}
// This method takes two integer values and returns the value closest to 21. If both values are greater than 21, it will return 0.