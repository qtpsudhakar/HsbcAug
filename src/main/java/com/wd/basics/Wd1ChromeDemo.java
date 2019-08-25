package com.wd.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Wd1ChromeDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
		
		//open browser
		ChromeDriver driver = new ChromeDriver();
		
		//navigate to google.com
		driver.get("http://google.com");
		
		//print page title
		System.out.println("opened page is "+driver.getTitle());
		
		//close browser
		driver.quit();

	}

}
