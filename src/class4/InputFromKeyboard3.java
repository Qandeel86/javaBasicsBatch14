package class4;

import java.util.Scanner;

public class InputFromKeyboard3 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		//we use nextint() if we want int type data from keyboard
		System.out.println("Please enter your age");
		int age=scanner.nextInt(); 
		
		if(age<18) {
			System.out.println("You should study");
		}else {
			System.out.println("You should start working");
		}
	}

}
