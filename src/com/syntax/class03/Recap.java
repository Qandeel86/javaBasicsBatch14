package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String concatenation helps us combine a String with any primitive data type together
		 * we 
		 * 
		 * 
		 */
		
		String firstName="Mina";
		String lastName="Henen";
		String fullName=firstName+" "+lastName;
		System.out.println(fullName);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="New York";
		String country="USA";
		String fullAddress=apartmentNo+" "+houseNo+" "+streetName+" "+city+" "+country;
		System.out.println(fullAddress);
		
		String step1="if we subtract 10 from 5 we get ="+10;//results in string
		System.out.println(step1);
		//its not defined java does not understand what to do when we ask her to subtract/multiply/divide...only add works
		
		System.out.println("if we subtract 10 from 5 we get ="+(10-5));
		
		
		
	}

}
