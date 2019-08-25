package com.wd.pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends OhrmBase{
	
	public WelcomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "PIM") 
	private WebElement lnkPIM;
	
	@FindBy(partialLinkText = "Add Emp")
	private WebElement lnkAddEmployee;
	
	public void clickOnPIMLink() {
		lnkPIM.click();
	}

	public void clickOnAddEmployeeLink() {
		lnkAddEmployee.click();
	}
}
