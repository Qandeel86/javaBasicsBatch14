package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	
	String day=input.next();
	
	if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
		System.out.println("It is a weekday");
	}else if(day.equals("Saturday") || day.equals("Sunday")) {
		System.out.println("It is a weekend");
	}else {
		System.out.println("Invalid day");
	}
		
		

	}

}
