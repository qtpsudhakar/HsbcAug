package com.wd.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.util.DriverFactory;

public class OhrmAddEmp {

	public static void main(String[] args) {
		OhrmBase ohrm = new OhrmBase();
		ohrm.openApplication("chrome");
		
		LoginPage loginPage = new LoginPage(); 		
		loginPage.enterUserName("admin");
		loginPage.enterPassword("admin123");
		loginPage.clickOnLogin();
		
		WelcomePage welcomePage = new WelcomePage();		
		welcomePage.clickOnPIMLink();
		welcomePage.clickOnAddEmployeeLink();
		
		AddEmployeePage addEmployeePage = new AddEmployeePage();
		addEmployeePage.enterFirstName("selenium");
		addEmployeePage.enterLastName("hq");
		addEmployeePage.clickOnSaveButton();
		
		PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage();
		personalDetailsPage.clickOnEditButton();
		personalDetailsPage.selectNatianality(3);
		
		ohrm.closeApplication();

	}

}










