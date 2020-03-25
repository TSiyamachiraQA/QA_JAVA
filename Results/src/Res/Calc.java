package Res;

public class Calc {
	
	 public void Results(double physics, double chemistry, double biology) {
		
		 System.out.println("Physics: " + physics);
		 System.out.println("Chemistry: " + chemistry);
		 System.out.println("Biology: " + biology);
		 
	 }
	

		public void examPercentage(float physics, float chemistry, float biology) {
			
			double chemistryPercentage = chemistry / 150*100;
			double biologyPercentage  = biology / 150*100;
			double physicsPercentage = physics / 150*100;
			
			double overallPercentage = (physicsPercentage + chemistryPercentage + biologyPercentage)/3; 
			

		if (overallPercentage < 60); {
			System.out.println("You Have Failed Overall");
		}
		
		if (physicsPercentage < 60) {
			System.out.println("You Have Failed Physics");
		}
		else if (chemistryPercentage < 60) {
			System.out.println("You Have Failed Chemistry");
		}
		else if (biologyPercentage < 60) {
			System.out.println("You Have Failed Biology");
		}
		
		}
	}	