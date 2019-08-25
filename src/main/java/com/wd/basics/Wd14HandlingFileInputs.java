package com.wd.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd14HandlingFileInputs {

	public static void main(String[] args) {
		
		//open browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");
		
		//navigate to OHRM
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		
		//print page title
		System.out.println("opened page is "+driver.getTitle());
		
		//enter text on user name
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		//enter text on password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//click on login
		driver.findElement(By.id("btnLogin")).click();
		
		//click on PIM
		driver.findElement(By.linkText("PIM")).click();
		
		//click on Add Employee
		driver.findElement(By.partialLinkText("Add Emp")).click();
		
		//enter first name
		driver.findElement(By.id("firstName")).sendKeys("selenium");
		
		//enter last name
		driver.findElement(By.id("lastName")).sendKeys("hq");
		
		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\envy\\Desktop\\HSBC_Aug\\Selenium.png");
		
		//click on save
		driver.findElement(By.id("btnSave")).click();
		
			}

}










