package com.java.basics;

public class C6FindDenominations {

	public static void main(String[] args) {

		int n = 7799;
		// 2000,500,200,100,50,20,10,5,2,1

		int den[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		for (int i = 0; i < den.length; i++) {
			System.out.println(n / den[i] + "*" + den[i]);
			n = n % den[i];
		}

	}

}
