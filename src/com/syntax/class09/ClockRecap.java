package com.syntax.class09;

public class ClockRecap 

	public static void main(String[] args) {

		 for (int h = 0; h < 24; h++) { // control hours

	            for (int m1 = 0; m1 <= 5; m1++) { // control first o clock

	                for (int m2 = 0; m2 <= 9; m2++) { // control 2nd digital control

	                    if (h < 10) {
	                        System.out.println("0" + h + ":" + m1 + m2);
	                    } else {
	                        System.out.println(h + ":" + m1 + m2);
	                    }
	                }
	                   
