package com.wd.basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Wd2FirefoxDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");
		
		//open browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//navigate to google.com
		driver.get("http://google.com");
		
		//print page title
		System.out.println("opened page is "+driver.getTitle());
		
		//close browser
		driver.quit();

	}

}
