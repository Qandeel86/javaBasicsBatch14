package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		//continue as compared to break, will not exit the loop,but it will go to beginning 
		//of the loop and continue it and move on to next iteration
		
		for(int i=1; i<5; i++) {
		
			if(i==3) {
				continue;
			}
			System.out.println(i);
			}

		//i want to print number from 1 to 20 except 6, 7 & 8
		
		for (int i=1; i<=20; i++) {
			if(i==6 || i==7 || i==8) {
				continue;
			}
			System.out.print(i+" ");
		}
		
	}

}
