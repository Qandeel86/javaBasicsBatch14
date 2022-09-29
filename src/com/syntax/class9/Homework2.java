package com.syntax.class9;

public class Homework2 {

	public static void main(String[] args) {
		// Create an array of animals and store 5 elements into it. Using 2 different loops print
		//all elements from the array.
		
		String[] animals= {"Lion","Tiger","Elephant","Monkey","Snake"};
		
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i]+" ");
		}
		
			System.out.println();
		
		String[] animals1= {"Lion","Tiger","Elephant","Monkey","Snake"};
		
		for(String animal:animals1) {
			System.out.println(animal);
		}
		
		

	}

}
