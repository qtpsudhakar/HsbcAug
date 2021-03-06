package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd19WorkingWithMouseActions_RightClick {

	public static void main(String[] args) throws InterruptedException {

		// open browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");

		// wait for page load
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// wait for element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// navigate to OHRM
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		WebElement elm = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(elm).build().perform();
		
	}

}












