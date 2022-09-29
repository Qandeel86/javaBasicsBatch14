package class4;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// Task6
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Do you have a credit card? Enter true or false");
		boolean haveCard=scanner.nextBoolean();
		if(haveCard) {
			System.out.println("What is balance on your card?");
		int cardBalance=scanner.nextInt();
		if(cardBalance>1000) {
			System.out.println("Pay off card immediately");
		}else {
			System.out.println("You can spend more");
		}
		}else {
			System.out.println("You should get a card");
		}
		
		
		
		
		
		
		
	}

}
