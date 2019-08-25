package com.wd.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.wd.util.DriverFactory;

public class Wd16HandlingFileInputs_Sikuli {

	public static void main(String[] args) throws AWTException, InterruptedException, FindFailed {

		// open browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");

		// navigate to OHRM
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");

		// print page title
		System.out.println("opened page is " + driver.getTitle());

		// enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		// enter text on password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// click on login
		driver.findElement(By.id("btnLogin")).click();

		// click on PIM
		driver.findElement(By.linkText("PIM")).click();

		// click on Add Employee
		driver.findElement(By.partialLinkText("Add Emp")).click();

		// enter first name
		driver.findElement(By.id("firstName")).sendKeys("selenium");

		// enter last name
		driver.findElement(By.id("lastName")).sendKeys("hq");

		driver.findElement(By.id("photofile")).click();

		String flPath = "C:\\Users\\envy\\Desktop\\HSBC_Aug\\Selenium.png";
		
		Screen scr = new Screen();
		scr.type("C:\\Users\\envy\\Desktop\\HSBC_Aug\\txtFileName.JPG", flPath);
		Thread.sleep(1000);
		scr.click("C:\\Users\\envy\\Desktop\\HSBC_Aug\\btnOpen.JPG");
		Thread.sleep(1000);
		// click on save
		driver.findElement(By.id("btnSave")).click();

	}

}










