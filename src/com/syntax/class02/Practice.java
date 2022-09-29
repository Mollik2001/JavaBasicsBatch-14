package com.syntax.class02;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Mollik";
		char student= 'a';
		String city= "Buffalo";
		String state= "NY";
		String phone1="124 8989";
		
		System.out.println("My name is"+name);
		System.out.println("I am"+student+"grade student");
		System.out.println("I live in"+ city+ state);
		System.out.println("And my number is"+phone1);
		
		// changes 
		
		city="detroit";  // reaasign
		state="Michigan";
		phone1="123 67940";
		student='B';
		
		System.out.println("My name is"+name);
		System.out.println("I am"+student+"student");
		System.out.println("I live in"+ city+ state);
		System.out.println("And my number is"+phone1);

	}

}
