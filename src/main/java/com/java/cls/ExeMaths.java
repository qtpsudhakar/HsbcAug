package com.java.cls;

import java.util.ArrayList;

public class ExeMaths {

	public static void main(String[] args) {
		
		DemoMaths m = new DemoMaths();
		int x = m.add(10, 20);
		System.out.println(x);
		
		System.out.println(m.findFactorial(6));
		
		System.out.println(m.findFactorial(4));
		
		int numbers[] = {2,3,1,5,6,4,8};
		System.out.println(m.isArrayValExist(numbers, 6));
		
		System.out.println(m.addNumbers(numbers));
		System.out.println(m.addNumbersUnlimited(numbers));
		
		System.out.println(m.addNumbersUnlimited(1,2,3,2,4,5,4,6,7,8,10));
		
		
		ArrayList<Integer> oddNos = m.getOddNumbers(10, 30);
		
		for(int on:oddNos) {
			System.out.println(on);
		}
		
		System.out.println(m.isPrime(21));
	}

}
