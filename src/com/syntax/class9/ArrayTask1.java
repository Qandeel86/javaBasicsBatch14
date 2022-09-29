package com.syntax.class9;

public class ArrayTask1 {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		char[] grades=new char[6];//first way
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		
		char[] grades1= {'A','B','C','D','E','F'};//second way
		System.out.println(grades1[1]);
		
		//when using loop to combine all in print
		
		for(int i=0; i<grades1.length;i++) {
			System.out.print(grades1[i]+" ");
		}
		
		
		

	}

}
