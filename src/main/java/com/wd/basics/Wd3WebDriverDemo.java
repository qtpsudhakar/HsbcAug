package com.wd.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wd.util.DriverFactory;

public class Wd3WebDriverDemo {

	public static void main(String[] args) {
		
		//open browser
		WebDriver driver = DriverFactory.getDriverFor("firefox");
		
		//navigate to google.com
		driver.get("http://google.com");
		
		//print page title
		System.out.println("opened page is "+driver.getTitle());
		
		//close browser
		driver.quit();

	}

}
