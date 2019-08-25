package com.java.basics;

import org.openqa.selenium.NoSuchElementException;

public class C3Arrays {

	public static void main(String[] args) {
		try {
			String userName = "admin";
			String password = "asdf";

			String userDetails[] = new String[2];
			userDetails[0] = "admin";
			userDetails[1] = "asdf";
			userDetails[2] = "awed";
			System.out.println(userDetails[0]);

			Object uData[] = new Object[3];
			uData[2] = 10;
			System.out.println(uData[0]);

			String usersData[][] = new String[2][2];

			// 1st user data
			usersData[0][0] = "admin";
			usersData[0][1] = "asdf";

			// 2nd user data
			usersData[1][0] = "guest";
			usersData[1][1] = "zxcv";

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("failed due to array size");
			//e.printStackTrace();
		}catch(NoSuchElementException n) {
			
		}
	}

}
