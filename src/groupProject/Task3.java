package groupProject;

public class Task3 {

	public static void main(String[] args) {
		//Create a 2D array of integer values. Print the sum of all numbers.
		
		int sum=0;
		
		int[][] arr= {
				{1,2,3,4,5},
				{6,7,8,9,10}
		};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}System.out.println(sum);
	
		
	}

}
