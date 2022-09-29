package com.syntax.class07;

public class WhileLoopTask {

	public static void main(String[] args) {
		// print all numbers from 50 to 20
		
		int num=50;
		
		while(num>=20) {
			System.out.print(num+" ");
			num--;
		}

		// print all even numbers from 1-20 (%2==0)
		
		int num2=2;//example 1
		
		while (num2<=20) {
			System.out.print(num2+" ");
			num2+=2;
			
		}
		int num3=2;//example 2
		while (num3<=20) {
			if (num3 % 2==0) {
				System.out.print(num3+" ");
			}
			num3++;
			
		}
		
	}

}
