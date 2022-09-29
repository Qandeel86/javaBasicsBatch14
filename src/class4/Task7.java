package class4;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// Task7
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many years have you worked?");
		int years=scanner.nextInt();
		if(years>=5) {
			System.out.println("You are eligible for a bonus");
			System.out.println("How much is your salary?");
		int salary=scanner.nextInt();
		if(salary>50000) {
			System.out.println("Your bonus will be 5000");
		}else {
			System.out.println("Your bonus will be 3000");
		}
		}else {
			System.out.println("You are not eligible for a bonus");
		}
		
		
		
		
		
		
		

	}

}
