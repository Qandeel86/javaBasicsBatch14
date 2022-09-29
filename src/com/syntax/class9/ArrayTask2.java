package com.syntax.class9;

public class ArrayTask2 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names=new String[11];//first way
		names[0]="Batyr";
		names[1]="Ahmed";
		names[2]="Safina";
		names[3]="Oksana";
		names[4]="Qandeel";
		names[5]="Ali";
		names[6]="Zamir";
		names[7]="Ozgun";
		names[8]="Ivan";
		names[9]="Jose";
		names[10]="Yusuf";
		System.out.println(names[4]);
		
		//second way
		
		String[] names1={"Batyr","Ahmed","Safina","Oksana","Qandeel","Ali","Zamir","Ozgun","Ivan","Jose","Yusf"};
		System.out.println(names1[4]);
		
		
		
		
		
		
		
		

	}

}
