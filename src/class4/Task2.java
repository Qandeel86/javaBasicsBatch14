package class4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Task2
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What is the mortgage rate?");
		double mortgageRate=scanner.nextDouble();
		if(mortgageRate<4.5) {
			System.out.println("Consider buying a house");
			System.out.println("How much is the house?");
			int housePrice=scanner.nextInt();
			if(housePrice>200000) {
				System.out.println("Please take out a loan");
			}else {
				System.out.println("Please pay in cash");
			}
		}else {
			System.out.println("Do not buy a house");
		}
		
		
		
		
		
		

	}

}
