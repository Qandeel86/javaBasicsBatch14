package class4;

public class NestedIf {

	public static void main(String[] args) {
		// If condition within an If condition
		//for String, we use .equal to indicate =to in if condition
		//outer if condition is the main door and only if that checks, the inner if conditions will be checked
		
		int time=8;
		String day="Monday";
		
		if(day.equals("Monday")) {
			
			if(time>7) {
				System.out.println("Lets go to office");
			}
			
			else {
				System.out.println("Lets sleep more");
			}
		}
		
		
		
		
		
		
	}

}
