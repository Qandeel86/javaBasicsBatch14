package com.syntax.class05;

import java.util.Scanner;
/*
 * windows: ctrl+shift+o (importing scanner in)
 */
public class ScannerRecap {

	public static void main(String[] args) {
	
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		//to capture diff values we need to use different options
		String name=input.next();//capturing String
		System.out.println(name);
		
		System.out.println("How old are you "+name);
		int age=input.nextInt();//capturing int
		System.out.println(name+" is "+age+" years old");
		
		System.out.println("How much money you have "+name);
		double money=input.nextDouble();
		System.out.println(name+" has $ "+money);
		
		System.out.println(name+" what is your grade");
		char grade=input.next().charAt(1);
		System.out.println(name+" has grade "+grade);
		
		
	}

}
