package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		//HOMEWORK: 1. Ask user to enter their country and capture it. Once values are captured print which 
	    //language user speaks.
			
			Scanner input=new Scanner(System.in);
			System.out.println("Please enter your country name");
			
			String country=input.nextLine();
			String language = null;
			//If-Else
			if(country.equals("Pakistan")) {
				language="Urdu";
			}else if(country.equals("Usa")) {
				language="English";
			}else if(country.equals("China")) {
				language="Chinese";
			}else if(country.equals("France")) {
				language="French";
			}
			
			System.out.println("You speak "+language);
			
			//Switch
			
			//In switch, can use .toUpperCase or .toLowerCase (similar to IgnoreCase in if-else statements)
			//	all matching cases must also be in lower or upper case depending on what you choose
			switch(country.toLowerCase()) {
			case "pakistan":
				language="Urdu";
				break;
			case "usa":
				language="English";
				break;
			case "china":
				language="Chinese";
				break;
			case "france":
				language="French";
				break;
			}
			System.out.println("You speak "+language);

	}

}
