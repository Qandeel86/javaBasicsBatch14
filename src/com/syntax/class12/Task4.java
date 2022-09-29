package com.syntax.class12;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
	//Write a program that reads two people's first names and if they expecting boy or girl? 
	//Based on the input suggests a name for a baby:
				/*Example Output:
				Mom’s first name? Mary
				Dad’s first name? Daniel
				Boy or Girl? boy
				Suggested baby name: DANRY

				Example Output:
				Mom’s first name? Mary
				Dad’s first name? Daniel
				Boy or Girl? girl
				Suggested baby name: MAIEL
				 */
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the mothers first name");
	String momName=scanner.next();
	System.out.println("Please enter the fathers first name");
	String dadName=scanner.next();
	System.out.println("What is the couple expecting? Enter boy or girl.");
	String babyGender=scanner.next();
	
	if(babyGender.equals("boy")) {
		System.out.println("Suggested baby name is "+dadName.toUpperCase().substring(0,dadName.length()/2)+momName.toUpperCase().substring(momName.length()/2));
	}else if(babyGender.equals("girl")){
		System.out.println("Suggested baby name is "+momName.toUpperCase().substring(0,momName.length()/2)+dadName.toUpperCase().substring(dadName.length()/2));
	}
	
	
	
		
		
		
		
		
		
	
		
		

	}

}
