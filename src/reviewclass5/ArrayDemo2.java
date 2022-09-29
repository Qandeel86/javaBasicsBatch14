package reviewclass5;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] arr=new int[] {10,20,30};
		//last index is always size-1 because arrays start with #0
		
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			
		}
		
		
	String[] dresses=new String[] {"Pink Dress","Cocktail","Summer Dress","Night Dress","Pencil Dress"};  
	System.out.println(dresses.length);
	//regular for loop
	//mostly this is how you will be using arrays
	for(int i=0;i<dresses.length;i++) {
		System.out.println("Lets try "+dresses[i]);
	}
	System.out.println();//will give space between print outs
	//enhanced for loop; java automatically picking elements in order and putting them inside variable we created (ex.dress)
	for(String dress:dresses) {
		System.out.println(dress);//will give output of all the dresses
	}
	System.out.println("*********************");
	System.out.println(Arrays.toString(dresses));//simple way of printing everything without loop
	
	
	
		
	}

}
