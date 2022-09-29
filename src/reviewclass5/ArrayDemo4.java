package reviewclass5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args) {
		//Ask user how many number of dresses using scanner
		//then create array and using for loop, ask user to enter amount for each dress
		//then print out values (prices for each dress)
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number of dresses you want to buy");
		int noOfDresses=scanner.nextInt();
		
		double[] prices=new double[noOfDresses];
		
		for(int i=0;i<noOfDresses;i++) {
			System.out.println("Please enter the price of dress no "+(i+1));//i+1 so it starts at index 1 when asking price of dress(exp.dress 1)
			prices[i]=scanner.nextDouble();
		}
		System.out.println(Arrays.toString(prices));
		
		//Limitations of enhanced for loop:
		//we can only go in  one direction
		//we can't skip the elements
		//we can't use enhanced for loop to update the elements in an array
		//we can only use it to access the elements
		
		double sum=0;//getting total for dress prices using enhanced loop
		for(double price:prices) {
			sum+=price;//shortcut for writing sum=sum+price
		}
		System.out.println("Total for all the dresses = "+sum);
		
	}

}
