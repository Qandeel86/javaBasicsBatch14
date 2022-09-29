package com.syntax.class08;

public class DigitalClockHW {

	public static void main(String[] args) {
		// Create a digital clock using nested loops. If you can, try to have a clock that would 
		//show 2 digits for hour and 2 digits for minutes (00:01-24:00)
		
		for(int h1=0; h1<=2; h1++) {
			for(int h2=0; h2<=9; h2++) {
				if(h1==2 && h2==4) {
					break;
				}
				for(int m1=0; m1<=5; m1++) {
					for(int m2=0; m2<=9; m2++) {
						
						System.out.println("The time is "+h1+h2+":"+m1+m2);
					}
				}
				}
			}
		}
		
		
		
		
		
		

	}


