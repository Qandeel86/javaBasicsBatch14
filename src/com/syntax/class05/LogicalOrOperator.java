package com.syntax.class05;

public class LogicalOrOperator {

	public static void main(String[] args) {
		
		String day="sunday";
		
		if(day.equals("saturday") || day.equals("sunday")) {
			
			System.out.println("I have Java class at Syntax");
		}
		System.out.println("");
		
		
		if(day.equals("saturday") && day.equals("sunday")) {
			
			System.out.println("I have Java class at Syntax");
		}
		
		System.out.println("");
		
		double money=90000;
		String title="Automation Tester";
		
		if(title.equals("Automation Tester") || money==120000) {
			
			System.out.println("Happy");
		}
			
	}
}
