package com.syntax.class11;

public class Phone1 {
//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung 
//with specific  attributes and behaviors.
	String color;
	String make;
	String model;
	double storage;
	
	void call(){
		System.out.println(make+" "+model+" can make calls");
	}
	void text() {
		System.out.println(make+" "+model+" can text other people "+"and has storage of "+storage);
	}
	void takePics(){
		System.out.println("The "+color+" "+make+" can take pictures");
	}
	void browseWeb() {
		System.out.println(make+" can browse the internet");
	}
	
	public static void main(String[] args) {
		Phone1 iPhone=new Phone1();
		iPhone.color="Gold";
		iPhone.make="iPhone";
		iPhone.model="13 Pro Max";
		iPhone.storage=512;
		
		iPhone.takePics();
		iPhone.call();
		
		System.out.println("*****************************************");
		Phone1 Google=new Phone1();
		Google.color="Black";
		Google.make="Google";
		Google.model="Pixel 6";
		Google.storage=128;
		
		Google.text();
		
		System.out.println("*****************************************");
		Phone1 Samsung=new Phone1();
		Samsung.color="Gray";
		Samsung.make="Samsung";
		Samsung.model="Galaxy S22";
		Samsung.storage=256;
		
		Samsung.browseWeb();
		
		
		
		
		
	}

}
