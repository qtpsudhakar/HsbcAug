package com.wd.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.util.DriverFactory;

public class OhrmBase {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	// public static WebDriver driver;
	public static WebDriverWait wait;

	public void openApplication(String brName) {
		try {
			driver.set(DriverFactory.getDriverFor(brName));

			// navigate to OHRM
			getDriver().get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void openApplication(String brName, String osName) {
		driver.set(DriverFactory.getDriverFor(brName, osName));

		// navigate to OHRM
		getDriver().get("http://localhost/orangehrm/symfony/web/index.php/auth/login");

	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}

	public void closeApplication() {
		getDriver().quit();
	}
}
