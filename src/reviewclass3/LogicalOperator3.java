package reviewclass3;

public class LogicalOperator3 {

	public static void main(String[] args) {
		
		double savings=2000000;
		boolean freeTime=true;
		String season="Summer";
		
		if(savings>1000000&&freeTime&&season.equals("Summer")) {
			System.out.println("Lets go to Bora Bora");
		}else {
			System.out.println("I need time and money");
		}
		
		
		

	}

}
