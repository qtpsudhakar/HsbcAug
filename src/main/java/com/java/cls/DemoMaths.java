package com.java.cls;

import java.util.ArrayList;

public class DemoMaths {

	// write a method which will add two numbers
	public int add(int a, int b) {
		return a + b;
	}

	public int findFactorial(int n) {

		int val = 1;
		for (int i = 1; i <= n; i++) {

			val = val * i;
		}

		return val;
	}

	public boolean isArrayValExist(int[] numbers, int num) {
		// int numbers[] = {2,3,1,5,6,4,8};

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == num) {
				return true;
			}
		}

		return false;
	}

	public int addNumbers(int arr[]) {

		int val = 0;
		for (int i = 0; i < arr.length; i++) {
			val = val + arr[i];
		}

		return val;
	}

	public int addNumbersUnlimited(int... arr) {

		int val = 0;
		for (int i = 0; i < arr.length; i++) {
			val = val + arr[i];
		}

		return val;
	}

	public ArrayList<Integer> getOddNumbers(int rStart, int rEnd) {

		ArrayList<Integer> odd=new ArrayList<Integer>();

		for (int n = rStart; n <= rEnd; n++) {
			if (n % 2 == 1) {
				odd.add(n);
			}
		}

		return odd;
	}

	public void printOddNumbers(int rStart, int rEnd) {

		for (int n = rStart; n <= rEnd; n++) {
			if (n % 2 == 1) {
				System.out.println(n);
			}
		}
	}
	
	public boolean isPrime(int n) {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public ArrayList<Integer> getPrimeNumbers(int rStart, int rEnd) {
		ArrayList<Integer> prime = new ArrayList<Integer>();
		for(int n=rStart;n<=rEnd;n++) {
			if(isPrime(n)) {
				prime.add(n);
			}
		}
		
		return prime;
	}
}










