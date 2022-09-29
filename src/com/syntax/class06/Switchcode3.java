package com.syntax.class06;

import java.util.Scanner;

public class Switchcode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		String country = in.nextLine();
		String FavouriteFood;

		switch (country) {
		case "usa":
			FavouriteFood = "burger and fries";
			break;
		case "Kazakhstan":
			FavouriteFood = "beshparmak";
			break;
		case "Turkey":
			FavouriteFood = "adana kebab";
			break;
		case "Bangladesh":
			FavouriteFood = "Biryani Curry";
			break;
		case "Yemen":
			FavouriteFood = "Lamb Mandi";
			break;
			default:
				FavouriteFood="Unknown";
		}
		System.out.println("You are  from"+country +"and your favourite food is" + FavouriteFood);
		
	}

}
