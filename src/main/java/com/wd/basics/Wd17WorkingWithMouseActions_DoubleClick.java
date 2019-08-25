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

public class Wd17WorkingWithMouseActions_DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		// open browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");

		// wait for page load
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// wait for element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// navigate to OHRM
		driver.get("https://api.jquery.com/dblclick/");
		
		WebElement frm = driver.findElement(By.cssSelector("div.demo.code-demo iframe"));
		driver.switchTo().frame(frm);
		
		WebElement elm = driver.findElement(By.tagName("div"));
		
		Actions act = new Actions(driver);
		act.moveToElement(elm).build().perform();
		act.moveToElement(elm).doubleClick(elm).build().perform();
		
	}

}












