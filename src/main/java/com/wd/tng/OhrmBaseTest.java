package com.wd.tng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.AddEmployeePage;
import com.wd.pom.LoginPage;
import com.wd.pom.OhrmBase;
import com.wd.pom.WelcomePage;

public class OhrmBaseTest {
	OhrmBase ohrm;

	@BeforeClass
	@Parameters({"browser"})
	public void openApplication(@Optional("chrome") String brName) {
		ohrm = new OhrmBase();
		ohrm.openApplication(brName);
	}

	
	@AfterClass
	public void closeApplication() {
		ohrm.closeApplication();
	}
}
