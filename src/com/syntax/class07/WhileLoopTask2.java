package com.syntax.class07;

public class WhileLoopTask2 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 100
		
		int a=20;
		
		while(a<=100) {
			if(a%2==0) {
				System.out.print(a+" ");
			}
			a++;
		}

	}

}
