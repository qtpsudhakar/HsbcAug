package com.wd.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

	public static WebDriver getDriverFor(String brName) {

		WebDriver driver = null;

		switch (brName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(co);
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumSoftware\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		
		return driver;
	}
	
	public static WebDriver getDriverFor(String brName, String osName) {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		switch (brName.toLowerCase()) {
		case "chrome":
			capabilities.setBrowserName(BrowserType.CHROME);
			break;
		case "firefox":
			capabilities.setBrowserName(BrowserType.FIREFOX);
			break;

		default:
			capabilities.setBrowserName(BrowserType.CHROME);
			break;
		}
		
		switch (osName.toLowerCase()) {
		case "windows":
			capabilities.setPlatform(Platform.WINDOWS);
			break;
		case "win10":
			capabilities.setPlatform(Platform.WIN10);
			break;
		case "mac":
			capabilities.setPlatform(Platform.MAC);
			break;

		default:
			capabilities.setPlatform(Platform.WINDOWS);
			break;
		}
		
		
		WebDriver driver=null;
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.211.1:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return driver;
	}
	
}













