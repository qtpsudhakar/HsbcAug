package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.wd.util.DriverFactory;

public class Wd8OhrmGetlistOptions {

	public static void main(String[] args) throws InterruptedException {
		
		//open browser
		WebDriver driver = DriverFactory.getDriverFor("chrome");
		
		//wait for page load
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//wait for element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//navigate to OHRM
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		
		//print page title
		System.out.println("opened page is "+driver.getTitle());
		
		//enter text on user name
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");		
		
		//enter text on password
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		//click on login
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		//click on PIM
		driver.findElement(By.linkText("PIM")).click();
		
		WebElement elm = driver.findElement(By.id("empsearch_termination"));
		
		Select lst = new Select(elm);
		List<WebElement> options = lst.getOptions();
		
		boolean isOptionExist=false;
		for(WebElement opt:options) {
			if(opt.getText().equalsIgnoreCase("Current Employees Only")) {
				isOptionExist=true;
				break;
			}
		}
		
		if(isOptionExist) {
			System.out.println("expected option is exist");
		}else {
			System.out.println("expected option is not exist");
		}
	}

}










