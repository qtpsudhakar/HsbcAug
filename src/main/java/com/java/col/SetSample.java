package com.java.col;

import java.util.HashSet;
import java.util.TreeSet;

public class SetSample {

	public static void main(String[] args) {
		
		//HashSet<Integer> values = new HashSet<Integer>();
		TreeSet<Integer> values = new TreeSet<Integer>();
		
		values.add(10);
		values.add(10);
		values.add(10);
		values.add(30);
		values.add(20);
		values.add(30);
		values.add(40);
		System.out.println(values.size());

		for(int i:values) {
			System.out.println(i);
		}
		
		Object data[] = values.toArray();
		
		
	}

}





