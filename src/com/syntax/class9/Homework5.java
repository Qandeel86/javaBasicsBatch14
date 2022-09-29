package com.syntax.class9;

public class Homework5 {

	public static void main(String[] args) {
		//Create an array to store char values and then print those in reverse order
		
		char[] grades= {'A','B','C','D'};
		
		for(int i=(grades.length-1);i>=0;i--) {
			System.out.println(grades[i]+" ");
		}

	}

}
