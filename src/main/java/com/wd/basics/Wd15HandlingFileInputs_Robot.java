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

import com.wd.util.DriverFactory;

public class Wd15HandlingFileInputs_Robot {

	public static void main(String[] args) throws AWTException, InterruptedException {

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
		
		//get system clip board
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		//place file path in clipboard
		cb.setContents(new StringSelection(flPath), null);
		
		
		Robot robo = new Robot();
		Thread.sleep(1000);
		//press ctrl + v
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//press enter
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		// click on save
		driver.findElement(By.id("btnSave")).click();

	}

}










