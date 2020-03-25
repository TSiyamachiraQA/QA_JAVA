package com.qa.main;

public class Calculator{
	
	public float annualsalary= 0;


	public String userName (String name) {
		
		return name;
	}
	
	public void salary (float salary) {
		annualsalary =annualsalary  += salary;
		
		System.out.println("Annual Salary : £" + salary);
		System.out.println("Monthly Salary : £" + salary/12);
		System.out.println("Daily Salary: £" + salary/365);
		
	}
	
	public String taxCategory () {
		if (annualsalary <= 21000 && annualsalary < 32500) {
			return "You Pay 10% tax: £" + annualsalary*0.1;
		} else if (annualsalary > 21000 && annualsalary <= 32500) {
			return "You Pay 20% tax: £" + annualsalary*0.2;
		} 
		else {
		return "You Pay 40% tax: £" + annualsalary*0.4;
		}

	}
}
