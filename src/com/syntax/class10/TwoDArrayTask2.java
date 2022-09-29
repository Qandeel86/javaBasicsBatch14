package com.syntax.class10;

public class TwoDArrayTask2 {

	public static void main(String[] args) {
		/*Create a 2D array(shorter way) in which first array will consist of 4 names and second 
		 * array will contain grades. Then your program should print name of the students that has
		 *  A and B grade
		 */

		String[][] arr= {

                {"Yusuf", "Hamza", "Adam", "John"},
                {"A", "B", "C", "D"}
        };

        System.out.println(arr[0][0]+"="+arr[1][0]);
        System.out.println(arr[0][1]+"="+arr[1][1]);
        System.out.println(arr[0][2]+"="+arr[1][2]);
        System.out.println(arr[0][3]+"="+arr[1][3]);
        
        
        
        
        
        
        for(int i=0; i<arr.length; i++ ) { //another way
        	for(int j=0; j<arr[i].length; j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        
        
        System.out.println("_____________________");
        
        for(String[] singleArray:arr) { //another way
        	
        	for(String el:singleArray) {
        		System.out.print(el+" ");
        	}
        	System.out.println();
        }
        
        
        
        
        
}
			
	}


