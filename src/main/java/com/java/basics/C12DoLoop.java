package com.java.basics;

import javax.swing.JOptionPane;

public class C12DoLoop {

	public static void main(String[] args) {

		// print number from 1 to 10

		boolean isMsgDisplayed = false;

		do {
			System.out.println("executing code until message is displayed");
			isMsgDisplayed = Boolean.parseBoolean(JOptionPane.showInputDialog("enter message display"));
		} while (!isMsgDisplayed);

	}

}
