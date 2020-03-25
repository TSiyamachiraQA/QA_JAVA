package com.qa.main;

public class TaxCalculator {
	
	public String taxCal(float salary) {
		if (salary <= 14999) {
			return "You Pay 0% tax";
		} else if (salary >= 15000 && salary <= 19999) {
			return "You Pay 10% tax";
		} 
		else if (salary >= 20000 && salary <= 29999) {
			return "You Pay 15% tax";
		} 
		else if (salary >= 30000 && salary <= 44999) {
			return "You Pay 20% tax";
		} 
		else {
		return "You Pay 40% tax";
		}
		
	}
	
	public String taxPaid(float salary) {
		if (salary <= 14999) {
			return "You Pay: £" + salary*0;
		}
		else if (salary >= 15000 && salary <= 19999) {
			return "You Pay: £" + salary*0.1;
		}
		else if (salary >= 20000 && salary <= 29999) {
			return "You Pay: £" + salary*0.15;
		} 
		else if (salary >= 30000 && salary <= 44999) {
			return "You Pay: £" + salary*0.2;
		} 
		else {
		return "You Pay: £" + salary*0.4;
		}
		}
}



	