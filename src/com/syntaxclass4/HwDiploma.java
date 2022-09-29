package com.syntaxclass4;

import java.util.Scanner;

public class HwDiploma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, 
		 * otherwise program should suggest to get a degree. 
		 * Then if user has a degree program should check a gpa score.
		 * if gpa score is higher or equals to 3.5 → 
		 * output should say “You are eligible for scholarship”,
		 * otherwise → “You should have studied harder” .
		 */
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Do you have diploma? true or false");
		
		 boolean userhasdiploma= true; scanner.nextBoolean();
		 if (userhasdiploma) { 
			 
	     System.out.println("Congratulations");
	     
		 } else { System.out.println("program should suggest to get a degree");
		 }
		 System.out.println("What is your GPA score?");
		 
		 double Gpa=4.00 ; scanner.nextDouble();
		 if (Gpa >=3.5) {
		  System.out.println("You are eligible for scholarship");
		  
		 } else { System.out.println("You should have studied harder"); }
		
		

	}

}







