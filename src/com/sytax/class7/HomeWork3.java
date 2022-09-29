package com.sytax.class7;

public class HomeWork3 {

	public static void main(String[] args) {

		/*
		 * print even number from 20 to 1
		 */
		int x = 20;
		while (x >= 1) {
			if (x % 2 == 0) {
			System.out.print(x + " ");}
			x--;}
		System.out.print("                        ");
/* 
 * another way
 */
		int y = 20;
		while (y >= 1) {
			System.out.print(y + " ");
			y -= 2;}

	}
}
