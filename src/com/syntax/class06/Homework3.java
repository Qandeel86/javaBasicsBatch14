package com.syntax.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		//3.Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
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
		
		//If-Else
		if(op=='+') {
			System.out.println("Result is "+add);
		}else if(op=='-') {
			System.out.println("Result is "+sub);
		}else if(op=='*') {
			System.out.println("Result is "+multi);
		}else if(op=='/') {
			System.out.println("Result is "+div);
		}
		//Switch
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
