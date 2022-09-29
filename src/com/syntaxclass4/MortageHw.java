package com.syntaxclass4;

import java.util.Scanner;

public class MortageHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price. 
		 * First, program should check 
		 * if rate is higher than 4.5 user will not buy a house,
		 * otherwise user will consider buying. 
		 * Once user decides to buy a house, 
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash
		 */
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("What is the mortage rate?");
		
		double mortagerate= 5.6; scanner.nextDouble();
		if (mortagerate>= 4.5) {
		System.out.println("user will not buy a house");
		} else { 
		System.out.println("user will consider buying");	
		}
		
System.out.println("How much is your budget for buying house? the house price less then 200000");
		long houseprice= 150000; scanner.nextLong();
		if (houseprice <=200000) {
		System.out.println("user will pay cash");
	} else { 
		System.out.println("user will take a loan");
	}

}}
