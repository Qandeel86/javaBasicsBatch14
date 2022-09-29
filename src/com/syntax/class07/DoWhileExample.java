package com.syntax.class07;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Did you get a job");
			answer=scanner.next();
	
		}while(!answer.equals("yes"));
		
		System.out.println("Congrats");
	
		
		//above example with While Loop example
		
		System.out.println("Did you get a job");
		answer=scanner.next();
		
		while(!answer.equals("yes")) {
			System.out.println("Did you get a job");
			answer=scanner.next();
		}
	}
}
