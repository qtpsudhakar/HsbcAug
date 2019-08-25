package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd6OhrmAddEmp_DeleteEmp {

	public static void main(String[] args) throws InterruptedException {
		
		//open browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");
		
		//wait for page load
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//wait for element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//navigate to OHRM
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		
		//print page title
		System.out.println("opened page is "+driver.getTitle());
		
		//enter text on user name
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");		
		
		//enter text on password
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		//click on login
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
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
	
		String empId = driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		
		driver.findElement(By.linkText("PIM")).click();
		
		//String chkXpath = "//td[.='0007']/preceding-sibling::td/input"
		
		String chkXpath = "//td[.='"+empId+"']/preceding-sibling::td/input";
		driver.findElement(By.xpath(chkXpath)).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("btnDelete")).click();
		
		driver.findElement(By.id("dialogDeleteBtn")).click();
	}

}










