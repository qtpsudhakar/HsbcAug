package com.wd.tng;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.AddEmployeePage;
import com.wd.pom.LoginPage;
import com.wd.pom.OhrmBase;
import com.wd.pom.WelcomePage;

public class OhrmBaseTestGrid {
	OhrmBase ohrm;

	@BeforeClass
	@Parameters({"browser","os"})
	public void openApplication(String brName,String os){
		ohrm = new OhrmBase();
		ohrm.openApplication(brName,os);
	}

	
	@AfterClass
	public void closeApplication() {
		ohrm.closeApplication();
	}
}
