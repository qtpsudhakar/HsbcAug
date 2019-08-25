package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd13WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {

		// open browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");

		// wait for page load
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// wait for element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// navigate to OHRM
		driver.get("https://www.tsrtconline.in/oprs-web/");

		String sPlace = "HYDERABAD";
		String tPlace = "TIRUPATHI";

		
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		
		if(al.getText().equalsIgnoreCase("Please select start place.")) {
			System.out.println("start place validation message displayed");
		}else {
			System.out.println("start place validation message is not displayed");
		}
		
		al.accept();
		
		// select start place
		driver.findElement(By.id("fromPlaceName")).sendKeys(sPlace);
		driver.findElement(By.linkText(sPlace)).click();

		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(1000);
		
		if(al.getText().equalsIgnoreCase("Please select end place.")) {
			System.out.println("end place validation message displayed");
		}else {
			System.out.println("end place validation message is not displayed");
		}
		
		al.accept();
		
		// select end Place
		driver.findElement(By.id("toPlaceName")).sendKeys(tPlace);
		driver.findElement(By.linkText(tPlace)).click();

		// select date
		driver.findElement(By.id("txtJourneyDate")).click();

		driver.findElement(By.linkText("30")).click();
		
		Thread.sleep(1000);
		
		//click on check
		driver.findElement(By.id("searchBtn")).click();
	}

}
