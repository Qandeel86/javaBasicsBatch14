package com.syntax.class07;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int num1=input.nextInt();
		System.out.println("Please enter second number");
		int num2=input.nextInt();
		System.out.println("Please choose an operator");
		char op=input.next().charAt(0);
		
		int add=num1+num2;
		int sub=num1-num2;
		int multi=num1*num2;
		int div=num1/num2;
		
int result = 0;
		
		switch(op) {
		case '+':
			result=add;
			break;
		case '-':
			result=sub;
			break;
		case '*':
			result=multi;
			break;
		case '/':
			result=div;
			break;
		}
		System.out.println("Result is "+result);

	}

}
