package com.java.basics;

public class C10PrintArrayData {

	public static void main(String[] args) {
		
		int ar[] = {20,30,40,50};

		System.out.println(ar.length);
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}

		for(int i:ar) {
			System.out.println(i);
		}
	
	}

}
