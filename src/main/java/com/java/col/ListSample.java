package com.java.col;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		
		List<String> friends = new ArrayList();
		friends.add("balu");
		friends.add("balu");
		friends.add("ranga");
		
		System.out.println(friends.size());

		
		friends.add(0, "indra");
		
		for(int i=0;i<friends.size();i++) {
			System.out.println(friends.get(i));
		}
	}

}
