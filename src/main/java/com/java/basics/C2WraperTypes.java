package com.java.basics;

public class C2WraperTypes {

	public static void main(String[] args) {

		int i1 = 10;
		
		byte b1 = (byte) i1; //explicit cast
		
		
		int i2 = 20;

		i2 = b1; //implicit cast
		
		System.out.println(i1 + i2);

		String n1 = "10";
		String n2 = "20";
		System.out.println(n1 + n2);
		
		int n3 =Integer.parseInt(n1);
		int n4 =Integer.parseInt(n2);
		
		
		
		
		
		
		
		
		Byte x = 127; // 8 bit
		Short s = 32000; // 16bit
		Integer i = 2140000000; // 32 bit
		Long l = 2160000000L; // 64 bit

		long cr = 4444_3333_2222_1111L;

		Float f = 1.11111111111111111111111F; // 32 bit

		Double d = 1.11111111111111111111111111111; // 64 bit

		Character c = 'x';

		Boolean isThere = true;
	}

}
