package com.syntax.class06;

import java.util.Scanner;

public class EnhanceHomework {

	public static void main(String[] args) {
		/* HW: 1. Write a program that will ask user to input inputs the current time (use 24 hour format).
		 * Based on the given time define:
			if hour is between 1-11 --> Morning
			if hour between 12-15 --> Afternoon
			if hour between 16-20 --> Evening
			if hour between 21-24 --> Night*/
		 
			Scanner input=new Scanner(System.in);
			
			
			System.out.println("Please enter the time");
			int time=input.nextInt();
			
			String timeOfTheDay = null;
			
			if(time>=1 && time<=11) {
				timeOfTheDay= "Morning";
			}else if(time>=12 && time<=15) {
				timeOfTheDay= "Afternoon";
			}else if(time>=16 && time<=20) {
				timeOfTheDay= "Evening";
			}else if(time>=21 && time<=24) {
				timeOfTheDay= "Night";
			}else {
				System.out.println("Wrong number is entered");
				timeOfTheDay="Invalid";
			}
				System.out.println(timeOfTheDay);//initialize variable to default it using compiler

	}

}
