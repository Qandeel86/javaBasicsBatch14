package class4;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		/*
		 * Scanner is a class that helps us take the input from keyboard
		 * it contains many diff smaller modules called methods that can help
		 * us take Strings booleans basically all types of data from the keyboard
		 */
		Scanner input= new Scanner(System.in);
		//Message will be displayed to user on console to enter his/her name
		System.out.println("Please enter your name");
		//Activates java program to take input from keyboard and store
		//inside name variable
		String name=input.next();
		//Prints whatever name user enters on the keyboard on the console
		System.out.println("Hello "+name);
		
	}

}
