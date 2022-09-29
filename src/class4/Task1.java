package class4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Homework 1 08/29/22
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you have a diploma? Enter True or False");
		boolean diplomaStatus=scanner.nextBoolean();
		
		if(diplomaStatus) {
			System.out.println("Congratulations!");
			System.out.println("What is your GPA?");
			double gpa=scanner.nextDouble();
			if(gpa>=3.5) {
				System.out.println("You are eligible for a scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
			
			
		}else {
			System.out.println("You should get a degree");
		}
		
		
		

	}

}
