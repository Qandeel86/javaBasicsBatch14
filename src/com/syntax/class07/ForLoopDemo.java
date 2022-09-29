package com.syntax.class07;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		//For loop is the most popular compared to While and Do While loops
		//use this loop when you know in advance how many times you need to print something
		for(int i=1; i<=5; i++) {
			
			System.out.println("Hello");
			
		}
		
		//print numbers from 1 to 20
		
		for(int i=1; i<=20; i++) {
			System.out.print(i+" ");
		}
		System.out.println("_________________________");
		//print numbers from 30 to 10
		
		for(int i=30; i>=10; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println("__________________________");
		//what is output
		
		for(int i=0; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println(" -------------------------- ");
        //what is the output

        for(int i=10; i<=25; i+=5) {
            System.out.print(i+" ");
        }

        System.out.println(" -------------------------- ");
        //what is the output

        int sum=0;

        for(int i=1; i<=6; i++) {
            sum+=i;
        }

        System.out.println(sum);
		
		
		
		
		
		
		
	}

}
