package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		//matching cases must be of the same data type as a variable
		//no duplicated case in switch
		//Y or y can't be used
		char choice='M';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
		System.out.println(answer);
		
		/*
		 * Limitations of switch cases:
		 * can not use logical operators
		 * can not use relational operators
		 * simply just checks for the equality
		 * 
		 */
		/*
		 * CANNOT work with boolean values
		 * CE: CANNOT switch on a value of type boolean
		 * 			boolean boo=true;
					switch(boo){
					}
		 * 
		 * 
		 * CANNOT work with float,double or long
		 */
		
		
		
		
		
	}

}
