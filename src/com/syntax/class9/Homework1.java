package com.syntax.class9;

public class Homework1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Using 2 different loops print 
		//all values from the array.
		
		
		String[] cars= {"Toyota", "Honda", "Lexus", "Mercedes", "Hyundai", "Kia"};
		
		for(int i=0; i<cars.length;i++) {
			System.out.println(cars[i]+" ");
		}
		System.out.println();

		
		String[] cars1= {"Toyota","Honda", "Lexus", "Mercedes", "Hyundai","Kia"};
		
		for(String car:cars1) {
			System.out.println(car+" ");
		}
		
		
		
		
		
		
		
		
		
	}

}
