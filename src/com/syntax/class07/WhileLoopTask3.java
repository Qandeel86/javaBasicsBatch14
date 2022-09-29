package com.syntax.class07;

public class WhileLoopTask3 {

	public static void main(String[] args) {
		// Print only odd numbers from 100 to 1
		//(2 different ways)
		
		int a=100;//first way
		
		while(a>=1) {
			if(a%2!=0) {
				System.out.print(a+" ");
			}
			a--;
		}

		System.out.println("_______________________________________________________________");
		
		int b=99;//second way
		
		while(b>=1) {
			System.out.print(b+" ");
			b-=2;
		}
		
		
		
	}

}
