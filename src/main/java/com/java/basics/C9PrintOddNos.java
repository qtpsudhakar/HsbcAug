package com.java.basics;

public class C9PrintOddNos {

	public static void main(String[] args) {

		// print number 10 for 5 times

		for (int i = 12; i <= 16; i++) {
			System.out.println(10);
		}

		// print numbers from 1 to 10

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// print numbers from 10 to 1
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// print odd numbers between 10 and 30

		/*
		 * for (int i = 11; i <= 30; i+=2) { System.out.println(i); }
		 */


		for (int i = 10; i <= 30; i++) {
			
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
	}

}







