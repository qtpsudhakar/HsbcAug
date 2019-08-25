package com.java.cls;

public class Gmail {

	public String uname;
	public static String password="default";
	
	public void login() {
		System.out.println("logged in with "+uname+" and "+password);
	}
	
	public void login1(String uname, String password) {
		System.out.println("logged in with "+uname+" and "+password);
		
	}
	
	public static void logout() {
		
		System.out.println("Loggedout of gmail ");
	}
}
