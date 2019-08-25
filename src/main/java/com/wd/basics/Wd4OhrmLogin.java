package com.wd.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.util.DriverFactory;

public class Wd4OhrmLogin {

	public static void main(String[] args) {
		
		//open browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");
		WebDriverWait wait = new WebDriverWait(driver, 20);
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
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("PIM")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("PIM")));
		
		//click on PIM
		driver.findElement(By.linkText("PIM")).click();
		
		//click on Add Employee
		driver.findElement(By.partialLinkText("Add Emp")).click();
		
		//enter first name
		driver.findElement(By.id("firstName")).sendKeys("selenium");
		
		//enter last name
		driver.findElement(By.id("lastName")).sendKeys("hq");
		
		//click on save
		driver.findElement(By.id("btnSave")).click();
		
		//click on edit
		driver.findElement(By.id("btnSave")).click();
		
		//select radio
		
		//if radio has id
		WebElement elm = driver.findElement(By.id("personal_optGender_1"));
		elm.click();

		//if radio doesn't have id
		List<WebElement> lstRadio  = driver.findElements(By.name("personal[optGender]"));
		lstRadio.get(1).click();
		
		//select list item
		WebElement elmCountry = driver.findElement(By.id("personal_cmbNation"));
		
		Select lstCountry = new Select(elmCountry);
		
		//selecting by visible text
		lstCountry.selectByVisibleText("Indian");
		
		//new Select(driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText("Indian");
		
		lstCountry.selectByIndex(2);
		
		
		lstCountry.selectByValue("6");
	}

}










