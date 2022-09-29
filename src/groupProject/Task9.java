package groupProject;

public class Task9 {

	public static void main(String[] args) {
		//Maximum and minimum number in the array?
		 int [] numbers = {5, 11, 30, 1, 102, 17};

	        int min = 50;
	        int max = 0;

	        for (int i=0; i < numbers.length; i++) {

	            if(min > numbers[i]) {
	                min = numbers[i];
	            } 
	            if (max < numbers[i]) {
	                max = numbers[i];
	            }
	        }
	        System.out.println("The max number is " + max);
	        System.out.println("The min number is " + min);
	}

}
