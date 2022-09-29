package class4;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your name");
		//takes String type input from keyboard and stores in name variable
		String name=scanner.nextLine();
		System.out.println("Please enter your age");
		//takes an int from keyboard and stores in age variable
		int age=scanner.nextInt();
		
		System.out.println("Hi "+name+" you are "+age+" years old");
		

	}

}
