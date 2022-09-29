package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		String firstName="Mollik";
		String lastName="Miah";
		System.out.println(firstName + lastName);
		System.out.println(firstName.concat(" ").concat(lastName));
		
		/*
	     *isEmpty() retruns true if a String is empty this method will retrurn false even if ypu have a space
	     *in a String variable however the isBlank method  does not count the space.
	     *
	     */
		
		String str="";
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		
	}

}
