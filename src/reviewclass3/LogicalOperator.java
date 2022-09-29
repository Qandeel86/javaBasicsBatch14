package reviewclass3;

public class LogicalOperator {

	public static void main(String[] args) {
		//Review 09-08-22
		
		boolean programmer=false;
		boolean manualTester=true;
		boolean knowFramework=false;
		
		if(programmer&&manualTester&&knowFramework) {
			System.out.println("You can be automation engineer");
		}else {
			System.out.println("You must know a programming language and manual testing "
					+" to be an automation engineer");
		}
//since one condition is false and other is true the else statement will print
	}

}
