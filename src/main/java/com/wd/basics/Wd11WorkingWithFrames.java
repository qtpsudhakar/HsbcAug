package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd11WorkingWithFrames {

	public static void main(String[] args) throws InterruptedException {

		// open browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");

		// wait for page load
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// wait for element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		// navigate to OHRM
		driver.get("https://www.redbus.in/");		
		
		driver.findElement(By.linkText("HOTELS")).click();
		
		driver.findElement(By.cssSelector(".profile-menu.icon.icon-account")).click();
	
		driver.findElement(By.xpath("//li[text()='SignIn / SignUp']")).click();
		
		WebElement frm = driver.findElement(By.cssSelector("iframe.modalIframe"));
		driver.switchTo().frame(frm);		
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("1234567890");
	}

}










