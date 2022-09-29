package com.syntax.class07;

public class Homework4 {

	public static void main(String[] args) {
		// 4. Print odd numbers between 20 and 50 (2 ways)
		
		int a=20;//first way
		
		while(a<=50) {
			if(a%2!=0) {
				System.out.print(a+" ");
			}
			a++;
		}
		
		System.out.println("_________________________________________");
		
		int b=21;//second way
		
		while(b<=50) {
			System.out.print(b+" ");
			b+=2;
		}
		
		
		

		

	}

}
