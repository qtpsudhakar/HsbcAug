package com.wd.tng;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.AddEmployeePage;
import com.wd.pom.LoginPage;
import com.wd.pom.OhrmBase;
import com.wd.pom.WelcomePage;

public class OhrmVerifyLoginFields extends OhrmBaseTest {

	WelcomePage welcomePage = new WelcomePage();

	@Test
	public void login() {
		try {
			LoginPage loginPage = new LoginPage();
			loginPage.isAllElementsExist();
			
		} catch (Exception n) {
			System.out.println("failed due to element not found");
			Assert.fail();
		} 
	}
}
