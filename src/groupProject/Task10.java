package groupProject;

public class Task10 {

	public static void main(String[] args) {
		//Write a java program to find the second largest
		//number in the array?
		int[] number = {30, 27, 15, 20, 25, 35,56,89};

        int largest = 0;
        int secondLargest = 0;

        for (int i=0; i < number.length; i++) {

            if (number[i] > largest ) {

                secondLargest = largest;
                largest = number[i];

            }
        }

        System.out.println(secondLargest);
	}

}
