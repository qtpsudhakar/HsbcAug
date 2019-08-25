package com.java.basics;

import javax.swing.JOptionPane;

public class C8PrintCapital {

	public static void main(String[] args) {
		String stCode = JOptionPane.showInputDialog("enter state code");

		switch (stCode) {
		case "ts":
			System.out.println("hyderabad");
			break;
		case "tn":
			System.out.println("chennai");
			break;
		default:
			System.out.println("state not found");
			break;

		}

	}

}
