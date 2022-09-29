package com.syntax.class05;

public class Recap2 {

	public static void main(String[] args) {
		// Nested If
		// IgnoreCase just ignores upper and lower case as in exp.below with
		// pollen/Pollen
		// To format code ctrl+shift+f
		boolean allergy = true;

		String allergyType = "pollen";

		if (allergy) {
			System.out.println("Lets check what allergy you have");

			if (allergyType.equalsIgnoreCase("Pollen")) {
				System.out.println("Try to stay indoors when trees are blooming");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy products");
			} else {
				System.out.println("We need to do some test");
			}

		} else {
			System.out.println("You are lucky");
		}

	}

}
