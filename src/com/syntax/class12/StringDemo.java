package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		
		String str=new String ("Java");
		// Count the number of character in a string including the space.
		
		
		System.out.println(str.length());
		
	        // Simpler and shorter way provided by Java Creators to make our life a little easier
	        String name="Mollik Miah is The Great"; // Only works for String and Wrapper classes
	        /*
	         * Counts the number of characters in a string including the spaces 
	         */
	        System.out.println(str.length());
	        System.out.println(name.length());
	        if(name.length()>15) {
	            System.out.println("Name can't be more than 15 characters");
	        }

	    }

	
}
