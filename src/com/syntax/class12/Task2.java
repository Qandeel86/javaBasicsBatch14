package com.syntax.class12;

public class Task2 {

	public static void main(String[] args) {
	//Create a String and if the String is not empty perform the following: 
	//if the String has an odd number of characters and has 3 or more characters, 
	//print the character in the middle of the String.
		
		String name="Qandeel";
		
		if(!name.isEmpty()) {
			if(name.length()>=3 && name.length()%2!=0) {
				System.out.println(name.charAt(name.length()/2));
			}
		}
		
		
		

	}

}
