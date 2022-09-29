package reviewclass5;

import java.util.Arrays;

public class Array2DDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[][] arr=new int[][] {
			{10,20,30},
			{25,25,63}
		};
		
		System.out.println(Arrays.toString(arr[1]));//accesing from index 1
		System.out.println(arr[1][2]);//accesing index 2(1) element 3(2)
		
		//finding smallest value in the 2D array
		int smallest=arr[0][0];
		for(int i=0;i<arr.length;i++){  //arr.length will give 2 because thats the number of rows
			
			for(int j=0;j<arr[i].length;j++) { //arr[i].length
				if(arr[i][j]<smallest) {
					smallest=arr[i][j];
				}
			}
		}
		System.out.println(smallest);
		
		
	}

}
