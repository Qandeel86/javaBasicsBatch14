package com.syntax.class11;

public class Dog1 {
//Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  
//with specific  attributes and behaviors.
	String breed;
	String name;
	String color;
	String favoriteGame;
	
	void walking() {
		System.out.println(name+" went for a walk");
	}
	void playingGame() {
		System.out.println("The "+breed+" favorite game is "+favoriteGame);
	}
	
	public static void main(String[] args) {
		
		Dog1 Husky=new Dog1();
		Husky.breed="Husky";
		Husky.name="Lulu";
		Husky.color="Gray";
		Husky.favoriteGame="Hide and seek";
		
		Husky.playingGame();
		
		System.out.println("*******************************");
		
		Dog1 Bulldog=new Dog1();
		Bulldog.breed="Bulldog";
		Bulldog.name="Rocky";
		Bulldog.color="Brown";
		Bulldog.favoriteGame="Tug of war";
		
		Bulldog.walking();
		
		System.out.println("*******************************");
		
		Dog1 Labrador=new Dog1();
		Labrador.breed="Labrador";
		Labrador.name="Max";
		Labrador.color="White";
		Labrador.favoriteGame="Fetch";
		
		Labrador.walking();
		Labrador.playingGame();
	}
	
	
	
	
	
	
	
	
	
}
