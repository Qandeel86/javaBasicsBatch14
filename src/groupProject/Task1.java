package groupProject;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/* Using Scanner create an array of integer values. After the array is created, 
		 * calculate the sum of all stored elements in that array
		 */
		Scanner input=new Scanner(System.in);
		
		int sum=0;
		int[] numbers=new int[4];
		 System.out.println("Please enter 4 numbers");
		 
		for(int num:numbers) {
			int a=input.nextInt();
			num=a;
			sum+=a;
		}
		System.out.println("The sum of the numbers is= "+sum);
		
		
	}

}
