package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		//break is used in loops to stop loop when certain conditions are met
		//break keyword usually used inside some type of condition
		for(int i=1; i<5; i++) {
			
			System.out.println("Hello");
			
			if(i==3) {
				break;
			}
			
		}
		
		System.out.println("End");
		
		boolean hungry=true;//example
		
		while(hungry) {
			System.out.println("Give me food");
			break;
		}
		System.out.println("End");

	}

}
