package com.syntax.class9;

public class ArrayFixedSize {

	public static void main(String[] args) {
		//printing below will give output as 0
		//array needs to start at 0
		int[] nums=new int[3];
		
		nums[1]=12;
		nums[2]=13;
		
		System.out.println(nums[0]);
		
		//in an array range of 3, trying to store a 4th element
		//will get an error when running below code because array sizes are fixed
		String[] colors=new String[3];
		
		colors[0]="White";
		colors[1]="Pink";
		colors[2]="Black";
		colors[3]="Yellow";
		
		System.out.println(colors[3]);

	}

}
