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
import com.wd.util.WebUtil;

public class OhrmAddEmployee extends OhrmBaseTest {

	WelcomePage welcomePage = new WelcomePage();

	@Test
	public void login() {
		try {
			LoginPage loginPage = new LoginPage();
			loginPage.enterUserName("admin");
			loginPage.enterPassword("admin123");
			loginPage.clickOnLogin();

			Assert.assertTrue(welcomePage.isDisplayed(), "IsLoginSuccessful");
			System.out.println("Login successful");
			Reporter.log("Login successful");
		} catch (Exception n) {
			System.out.println("failed due to element not found");
			String imgPath =WebUtil.getScreen();
			String path = "<img src='file://"+imgPath+"' alt='' />";
			Reporter.log(path);
			Assert.fail();
		} catch (AssertionError a) {
			System.out.println("failed due to verification failure:" + a.getMessage());
			Assert.fail();
		}
	}

	@Test(dependsOnMethods = "login")
	public void addEmployee() {
		welcomePage.clickOnPIMLink();
		welcomePage.clickOnAddEmployeeLink();

		AddEmployeePage addEmployeePage = new AddEmployeePage();
		addEmployeePage.enterFirstName("selenium");
		addEmployeePage.enterLastName("hq");
		addEmployeePage.clickOnSaveButton();
	}

}
