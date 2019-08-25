package com.wd.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.wd.pom.OhrmBase;

public class WebUtil extends OhrmBase {

	
	public static boolean isElementExist(WebDriver driver, By locator) {
		try {
			driver.findElement(locator);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean isElementExist(By locator) {
		try {
			getDriver().findElement(locator);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void selectListItem(By locator, String lstItemName) {
		WebElement elm=null;
		try {
			elm = getDriver().findElement(locator);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try {			
			new Select(elm).selectByVisibleText(lstItemName);
		}catch(Exception e) {
			new Select(elm).selectByIndex(1);
		}
	}
	
	public static String getScreen() {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File fl = ts.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("src\\..\\Reports\\demo"+DataUtil.getUniqueID()+".png");
		try {
			FileUtils.copyFile(fl, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dst.getAbsolutePath();
	}
}

















