package com.syntax.class06;

import java.util.Scanner;

public class Homework1 {

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
		switch(country) {
		case "Pakistan":
			language="Urdu";
			break;
		case "Usa":
			language="English";
			break;
		case "China":
			language="Chinese";
			break;
		case "France":
			language="French";
			break;
		}
		System.out.println("You speak "+language);
	}

}
