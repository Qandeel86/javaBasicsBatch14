package com.syntax.class10;

public class TwoDArrayDemo1 {

	public static void main(String[] args) {
		
		String[][] countries= {
				{"Usa", "Canada"},//1st array with index 0
				{"Peru", "Brazil","Colombua", "Ecuador"},//2nd array with index 1
				{"Ethiopia", "Egypt","Kenya"},
				{"Germany", "Turkiye", "Moldova", "Ukraine"},
				{"Kazakhstan", "Afghanistan","Korea"}
				
		};
		System.out.println(countries.length);//size of array will be 5
		
		int elOf1arr=countries[0].length;//accesing element of first array
		System.out.println(elOf1arr);
		
		int elOf2arr=countries[1].length;//accessing element of second array
		System.out.println(elOf2arr);
		
		System.out.println("__________ getting all values from 2d array _________");
		
		for(int r=0; r<countries.length; r++) {//loops over rows
			for(int c=0; c<countries[r].length; c++) {
				System.out.println(countries[r][c]);
			}
			System.out.println();
		}
		
		
		System.out.println(" ------- getting all values from 2d array using for each loop -----");

        for (String[] country : countries) {

            for (String c : country) {

                if (c.equals("Kazakhstan")) {
                    System.out.println(c+ " is my home country");
                } else {
                    System.out.print(c + "  ");
                }
            }
            System.out.println();	
	}

}
}
