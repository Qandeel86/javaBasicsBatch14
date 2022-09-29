package com.syntax.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// 2. Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		//At the end your program should print which grade was entered by a user with explanation.
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		String grade=input.next();
		String exp;
		//If-Else
		
		if(grade.equals("A")) {
			exp="Excellent";
		}else if(grade.equals("B")) {
			exp="Good";
		}else if(grade.equals("C")) {
			exp="Average";
		}else if(grade.equals("D")) {
			exp="Bad";
		}else {
			exp="Not Acceptable";
		}
		System.out.println("Your grade is "+grade+" and that is "+exp);
		
		//Switch
		
		switch(grade) {
		case "A":
			exp="Excellent";
			break;
		case "B":
			exp="Good";
			break;
		case "C":
			exp="Average";
			break;
		case "D":
			exp="Bad";
			break;
		default:
			exp="Not Acceptable";
			break;
		}
		System.out.println("Your grade is "+grade+" and that is "+exp);
	
	}

}
