package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.wd.util.WebUtil;

public class WelcomePage extends OhrmBase{
	
	public static By lnkPIM = By.linkText("PIM");
	public static By lnkAddEmployee = By.partialLinkText("Add Emp");
	
	public void clickOnPIMLink() {
		getElement(lnkPIM).click();
		Reporter.log("Clicked on PIM link");
	}

	public void clickOnAddEmployeeLink() {
		getElement(lnkAddEmployee).click();
		Reporter.log("Clicked on Add Employee Link");
	}
	
	public boolean isDisplayed() {
		return WebUtil.isElementExist(lnkPIM);
	}
}
