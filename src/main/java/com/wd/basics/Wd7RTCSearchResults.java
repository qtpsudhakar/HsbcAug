package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.util.DriverFactory;

public class Wd7RTCSearchResults {

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

		// select start place
		driver.findElement(By.id("fromPlaceName")).sendKeys(sPlace);
		driver.findElement(By.linkText(sPlace)).click();

		// select end Place
		driver.findElement(By.id("toPlaceName")).sendKeys(tPlace);
		driver.findElement(By.linkText(tPlace)).click();

		// select date
		driver.findElement(By.id("txtJourneyDate")).click();

		driver.findElement(By.linkText("30")).click();
		
		Thread.sleep(1000);
		
		//click on check
		driver.findElement(By.id("searchBtn")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className("srvceNO"), 0));
		
		List<WebElement> lstServ = driver.findElements(By.className("srvceNO"));
		
		for (int i = 0; i < lstServ.size(); i++) {
			System.out.println(lstServ.get(i).getText());
		}
		
		for(WebElement service:lstServ) {
			System.out.println(service.getText());
		}
	}

}
