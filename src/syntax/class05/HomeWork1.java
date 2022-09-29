package syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Write a program that will ask user to input inputs the current time
		 *  (use24 hour format).
		 *  Based on the given time define: 
		 *  if hour is between 1-11 -->
		 * Morning if hour between 12-15 -->
		 *  Afternoon if hour between 16-20 --> 
		 *  Evening
		 * if hour between 21-24 --> Night
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println(" the current time of use24 hour format is");
		int currentTime= input.nextInt();
		
		if (currentTime>=1 && currentTime <= 11)
		{
			System.out.println("Morning");
		} else if (currentTime >=12 && currentTime<= 15) {
			System.out.println("Afternoon");
		} else if (currentTime >= 16 && currentTime <=20) {
			System.out.println("Evening");
		} else if (currentTime >= 21 && currentTime <=24) {
			System.out.println("Night");
		}
			
		
	}

}
