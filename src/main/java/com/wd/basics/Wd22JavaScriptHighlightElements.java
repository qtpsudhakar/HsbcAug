package com.wd.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd22JavaScriptHighlightElements {

	public static void main(String[] args) {

		//https://www.w3schools.com/jsref/dom_obj_document.asp
		//https://www.w3schools.com/jsref/dom_obj_all.asp
			
		// open browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");

		// navigate to OHRM
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");

		// enter text on user name

		WebElement elm = driver.findElement(By.id("txtUsername"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = 'thick solid #0000FF';", elm);

		elm.sendKeys("admin");

		// enter text on password
		// driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		js.executeScript(
				"document.getElementById('txtPassword').style.border = 'thick solid #0000FF';document.getElementById('txtPassword').value='admin123';");

		// click on login
		WebElement login = (WebElement) js.executeScript("return document.getElementById('btnLogin');");
		login.click();
		
	}

}
