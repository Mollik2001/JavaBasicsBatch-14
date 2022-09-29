package com.syntaxclass4;

import java.util.Scanner;

public class Rep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		  System.out.println("A person who is eligible to vote must be older or equal to 18 years old");
		  
		  System.out.println("Please enter your age");
		  
		  int age=18; scanner.nextInt();
		if (age>=18)
		{System.out.println("You are eligible to vote");
		}
		  else {
			  System.out.println("You are not eligible to vote");
		}

		}

		}
		
