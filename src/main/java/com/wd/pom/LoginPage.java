package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.wd.util.WebUtil;

public class LoginPage extends OhrmBase{
	
	private static By txtUserName = By.xpath("//*[@id='txtUsername1']");
	private static By txtPassword = By.id("txtPassword");
	private static By btnLogin = By.id("btnLogin");
	
	public void enterUserName(String uName) {
		getElement(txtUserName).sendKeys(uName);
		Reporter.log(uName+" entered on UserName Text box");
	}
	
	public void enterPassword(String password) {
		getElement(txtPassword).sendKeys(password);
		Reporter.log(password+" entered on Password Text box");
	}
	
	public void clickOnLogin() {
		getElement(btnLogin).click();
		Reporter.log("Clicked login Button");
	}
	
	public void isAllElementsExist() {
		try {
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(WebUtil.isElementExist(txtUserName), "IsUserNameExist");
		sa.assertTrue(WebUtil.isElementExist(txtPassword), "IsPasswordExist");
		sa.assertTrue(WebUtil.isElementExist(btnLogin), "IsLoginExist");
		
		sa.assertAll(); //throw assertion error
		System.out.println("All fields in page exist");
		}catch(AssertionError e) {
			System.out.println("Failed due to verification:"+e.getMessage());
			throw e;
		}
	}
}









