package com.sytanx.class11;

public class Dog {

	// State
	// Attributes/ properties/fields.
	
	String name;
	String color;
	String breed;
	double weight;
	int age;
// these are behavior of a dog.
	void bark () {
		System.out.println("Barking..............");
	} void sleep () {
	System.out.println("Dog is slepping");
	} 
	public static void main (String[]args) {
		
		
		// creating object from class
		// new dog ();=> is creates an object of class dog.
		Dog dog1= new Dog();
		dog1. bark();
		dog1. sleep();
		
	}


}

	
	
