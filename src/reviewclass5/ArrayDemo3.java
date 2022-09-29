package reviewclass5;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double size=10;//not possible with double
		int [] arr=new int[10];
		
		for(int i=0; i<arr.length;i++) { //this is increasing your index
			arr[i]=10;//you can change number on this line to print that number 10x's
		}
		System.out.println(Arrays.toString(arr));//trying to store #10 in all the indexes
		//in above example you can declare variable (exp.int start=11;)
		//and write arr[i]=11;
		//and under that put start++;(this will print numbers 11-20
	
		
		//enhanced loop to print out the sum of all numbers
		int sum=0;
		for(int num:arr) {
			sum=sum+num;//can also write as sum+=num;
		}
		System.out.println(sum);
	
	
	
	}

}
