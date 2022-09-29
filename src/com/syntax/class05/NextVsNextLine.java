package com.syntax.class05;

import java.util.Scanner;

public class NextVsNextLine {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter full name");
		
		String name=scan.nextLine();//capturing more than one word, use next line
		System.out.println(name);
	}

}
