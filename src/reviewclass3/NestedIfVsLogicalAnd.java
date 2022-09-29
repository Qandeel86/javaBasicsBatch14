package reviewclass3;

public class NestedIfVsLogicalAnd {

	public static void main(String[] args) {
		
		//if we don't use logical operators then we would need
		//to write code as below and that is a lot to write using
		//nested if conditions
		
		//Nested if conditions are better than using logical operators in the case where you need more control
		//of the outcome (exp. the code below has the same output for else condition, and that is ideal with logical op.
		//but if all else conditions need to be a little different then go with nested if
		boolean programmer=false;
		boolean manualTester=true;
		boolean knowFramework=false;
		
		if(programmer) {
			if(manualTester) {
				if(knowFramework) {
					System.out.println("You can be automation engineer");
				}else {
					System.out.println("You must know a programming language,manual testing and some framework to be an automation engineer");
				}
			}else {
				System.out.println("You must know a programming language,manual testing and some framework to be an automation engineer");
			}
			
		}else {
			System.out.println("You must know a programming language,manual testing and some framework to be an automation engineer");
		}

	}

}
