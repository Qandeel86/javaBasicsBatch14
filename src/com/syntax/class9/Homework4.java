package com.syntax.class9;

public class Homework4 {

	public static void main(String[] args) {
		//From an array of integer elements find the largest number.
		
		
		int[] num= {100,300,400,200};
		int largestNum=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>largestNum) {
			largestNum=num[i];
			}
			
		}
		System.out.println(largestNum);
	}

}
