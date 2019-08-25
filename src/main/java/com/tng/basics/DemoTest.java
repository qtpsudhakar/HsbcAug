package com.tng.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {
	
	//BeforeSuite
	//BeforeTest
	//AfterTest
	//AfterSuite
	
	@BeforeClass
	public void openApplication() {
		System.out.println("application opened");
	}

	@BeforeMethod
	public void login() {
		System.out.println("Logged into app");
	}

	@Test(priority = 3)
	public void createMail() {
		System.out.println("Mail created");
	}

	@Test(priority = 4)
	public void sendMail() {
		System.out.println("mail sent");
	}

	@AfterMethod
	public void logout() {
		System.out.println("Logged out of mail");
	}

	@AfterClass
	public void closeApp() {
		System.out.println("Application closed");
	}
}
