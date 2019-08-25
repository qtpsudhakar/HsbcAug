package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class AddEmployeePage extends OhrmBase{

	public static By txtFirstName = By.id("firstName");
	public static By txtLastName = By.id("lastName");
	public static By btnSave = By.id("btnSave");

	public void enterFirstName(String fName) {
		getElement(txtFirstName).sendKeys(fName);
		Reporter.log(fName+" entered on first name textbox");
	}

	public void enterLastName(String lName) {
		getElement(txtLastName).sendKeys(lName);
		Reporter.log(lName+" entered on last name textbox");
	}

	public void clickOnSaveButton() {
		getElement(btnSave).click();
		Reporter.log("Clicked on Save button");
	}
}
