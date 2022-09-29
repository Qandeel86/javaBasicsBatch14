package class4;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// Task5
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What is the name of your city?");
		String cityName=scanner.next();
		System.out.println("What is the temperature?");
		int temp=scanner.nextInt();
		temp=(temp-32)*5/8;
		System.out.println("The temperature of "+cityName+" is "+temp);
		
		
		
		
		
		
		
		
		
		

	}

}
