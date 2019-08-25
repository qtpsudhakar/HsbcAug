package com.java.col;

import java.util.HashMap;

public class MapSample {

	public static void main(String[] args) {
		
		HashMap<String, String> userDetails = new HashMap<String, String>();
		userDetails.put("username", "admin");
		userDetails.put("password", "asdf");
		
		System.out.println(userDetails.get("username"));

		login(userDetails);
	}

	
	public static void login(HashMap<String, String> userData) {
		
		System.out.println("user name is "+userData.get("username"));
		System.out.println("password is "+userData.get("password"));
	}
}
