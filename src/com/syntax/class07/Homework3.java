package com.syntax.class07;

public class Homework3 {

	public static void main(String[] args) {
		// 3. Print even numbers from 20 to 1 (2 ways)
		
		int a=20;//first way
		
		while(a>=1) {
			if(a%2==0) {
				System.out.print(a+" ");
			}
			a--;	
		}
		System.out.println("_______________________________________________");
		
		int b=20;//second way
		
		while(b>=1) {
			System.out.print(b+" ");
			b-=2;
		}
		
		

	}

}
