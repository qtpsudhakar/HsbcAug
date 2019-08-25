package com.java.cls;

public class CreateMail {

	public static void main(String[] args) {
		
		Gmail gm1 = new Gmail();
		gm1.uname="admin";
		Gmail.password="asdf";
		
		gm1.login();
		Gmail.logout();

		Gmail gm2 = new Gmail();
		Gmail.password="zxcv";
		
		System.out.println(gm2.uname);
		System.out.println(Gmail.password);
		
		
		gm1.login1("sudhakar", "qwert");
	}

}
