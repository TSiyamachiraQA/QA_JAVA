package Res;

public class Calc {
	
	int total (int Physics, int Chemistry, int Biology) {
	return Physics + Chemistry + Biology;
}
	float percent(float Physics, float Chemistry, float Biology) {
		float percent = (Physics + Chemistry + Biology)/450*100;
		return percent;
		if (percent<60) {
			System.out.println("You Have Failed Overall");
		}
		else if (Physics/1.5<60||Chemistry/1.5<60||Biology/1.5<60) {
			System.out.println("You Have Failed One or More Exams");
		}
	}
	

	}
