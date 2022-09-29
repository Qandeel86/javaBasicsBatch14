package com.syntax.class05;

public class Recap {

	//shortcut to autocomplete: ctrl+space
	
	public static void main(String[] args) {
		//If-else-if statement AKA ladder
		//In this condition, if non of the else if conditions are true then nothing will print unless there is an else block
		String phone="Motorolla";
		
		if(phone.equals("iPhone")) {
			System.out.println("I want to buy it for me");
		}else if(phone.equals("Samsung")) {
			System.out.println("I want to buy it for my husband");
		}else if(phone.equals("Nokia")) {
			System.out.println("I want to buy it for my grandma");
		}else {
			System.out.println("That is not the phone I was looking for");
		}
	}

}
