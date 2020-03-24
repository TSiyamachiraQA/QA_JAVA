package Calc;

public class Runner {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(4,7));
		System.out.println(calc.subtract(10,5));
		System.out.println(calc.div(25, 17));
		System.out.println(calc.mult(3, 5));
	}


}
