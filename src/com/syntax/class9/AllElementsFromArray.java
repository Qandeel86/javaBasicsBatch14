package com.syntax.class9;

public class AllElementsFromArray {

	public static void main(String[] args) {
		
		String[] iceCream= {"vanilla","chocolate","pistashio","kulfi","mango"};
		
		System.out.println(iceCream[0]);
		System.out.println(iceCream[1]);
		
		//how to get all values?
		//combining arrays with loops
		//using iceCream.length Java will know size of array
		for(int i=0; i<iceCream.length;i++) {
			System.out.println(iceCream[i]);
		}

	}

}
