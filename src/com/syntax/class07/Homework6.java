package com.syntax.class07;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		// 6. Declare a variable to store a price for a coffee. 
		//Ask the user to pay for a coffee. Keep asking to pay for coffee until 
		//the user enters the EXACT amount . If the user gives more than coffee 
		//price --> ask them to give less, if the user gives less money then ask 
		//to give more. Once user give EXACT amount print “Please enjoy your coffee"

		/*Scanner scanner=new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Did you get a job");
			answer=scanner.next();
	
		}while(!answer.equals("yes"));
		
		System.out.println("Congrats");
		 */
		Scanner input=new Scanner(System.in);
		double price= 5.95;
		double price1;
		
		do {
			System.out.println("Please enter amount paid for your coffee");
			price1=input.nextDouble();
			
			if(price1<price) {
				System.out.println("Please pay more for your coffee");
			}else if(price1>price) {
				System.out.println("Please pay less for your coffee");
			}
			
			}while(price1!=price);
				System.out.println("Please enjoy your coffee!");
			
		
		
		
		
		
		
		
		
		
	}

}
