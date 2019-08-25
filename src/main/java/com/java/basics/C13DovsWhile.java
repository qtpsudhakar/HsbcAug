package com.java.basics;

public class C13DovsWhile {

	public static void main(String[] args) {
		
		int i=10;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("while completed");
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		System.out.println("do completed");
	}
}
