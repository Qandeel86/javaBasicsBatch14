package com.syntax.class08;

import java.util.Scanner;

public class LoopTasks {

	public static void main(String[] args) {
		
		int sum1=0;//sum of even numbers 1-50
		for(int i=2; i<=50; i+=2) {
			sum1+=i;
		}
		System.out.println(sum1);
		
		int sum2=0;//sum of odd numbers 1-50
		for(int i=1; i<=50; i+=2) {
			sum2+=i;
		}
		System.out.println(sum2);
		
		
		int sumOdd = 0;//better way to combine even and odd
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
        
        Scanner input=new Scanner(System.in);//have user guess secret # and once selected print "you won"
		int secretNumber=8;
		int guessNumber;
		do{
			System.out.println("Please guess the secret number from 1 to 10");
			guessNumber=input.nextInt();
		}while(secretNumber!=guessNumber);
		System.out.println("Congratulations! You won!");

	}

}
