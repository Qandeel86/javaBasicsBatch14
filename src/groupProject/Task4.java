package groupProject;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		//Create a 2D array or integer type where you will store
		//odd and even numbers. Develop a program which will
		//identify/print the even numbers only.
		int[][] num = { 
				{ 10, 29, 30, 40 },
                { 9, 19, 20, 39 } 
				};

        for (int i = 0; i < num.length; i++) {
             for (int j = 0; j < num[i].length; j++)
            if (num[i][j] % 2 == 0) {
             System.out.println(num[i][j]);
            }
        }
          
	}

}
