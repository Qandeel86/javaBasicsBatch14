package com.syntax.class9;

public class Patterns {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
			System.out.print("* ");
			}
			System.out.println();
			}
			System.out.println(" ------------------  ");
			for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
			System.out.print(i+" ");//printing rows
			}
			System.out.println();
			}
			System.out.println(" ------------------  ");
			for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
			System.out.print(j+" ");//printing columns
			}
			System.out.println();
			}

	}

}
