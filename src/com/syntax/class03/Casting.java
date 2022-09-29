package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * type casting is converting 1 data type to another data type
		 * 2 types of cast types: converting small box to large and vice versa
		 * Why learn about cast typing?  merging codes when working as team so other ppls codes easier to use
		 * when converting smaller to larger we dont need to do anything (called widening or "implicit" or automatic)
		 * when converting larger to smaller we need to put that same data type in() (called narrowing or "explicit" or manual)
		 *  
		 */
		
		byte box1=127;//smallest box (8 bits)
		short box2=3333;//double the size of box1 in terms of bits (16 bits); Char is also 16 bits
		int box3=45454545;//large box most commonly used (32 bits)
		long box4=45454545;//slightly large box (64 bits)
		float box5=414564545;//even larger box (32 bits);even tho smaller bits than long its bigger because of scientific notation and represents larger numbers in smaller space
		double box6=454545445;//largest(64 bits)
		
		int number=(int)15.2;//we can't store decimal number in a box of type int
		System.out.println(number);
		
		byte smallerBox=(byte)box2;
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		
		long box7=box1;//we can do thus because box 7 is larger than box1
		
		float box8=(float)box6;//as box6 is larger it is double we need type casting to assign the value
		
		char a=67;
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
		
	}

}
