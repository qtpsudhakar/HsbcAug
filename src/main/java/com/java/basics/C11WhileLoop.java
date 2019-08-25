package com.java.basics;

import javax.swing.JOptionPane;

public class C11WhileLoop {

	public static void main(String[] args) {
		
		//print number from 1 to 10
		
		boolean isMsgDisplayed =false;
		
		while(!isMsgDisplayed) {
			System.out.println("executing code until message is displayed");
			isMsgDisplayed=Boolean.parseBoolean(JOptionPane.showInputDialog("enter message display"));
		}

	}

}
