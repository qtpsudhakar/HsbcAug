package com.cuc.steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.util.DriverFactory;
import com.wd.util.WebUtil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OhrmSteps {
	WebDriver driver;

	@Given("^I launch the chrome browser$")
	public void openBrowser() {
		// Write code here that turns the phrase above into concrete actions
		// open browser
		driver = DriverFactory.getDriverFor("chrome");
		System.out.println("Browser opened");
	}

	@Given("^I enter OrangeHRM Url$")
	public void i_enter_OrangeHRM_Url() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// navigate to OHRM
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		System.out.println("Navigated to application");
	}

	@When("^I enter the username$")
	public void i_enter_the_username() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		System.out.println("Admin entered on user name");
	}

	@When("^I enter the password$")
	public void i_enter_the_password() {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		System.out.println("admin123 added on Password");
	}

	@When("I enter the username as {string} and password as {string}")
	public void enterUserNameAndPassword(String uname, String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		System.out.println(uname+" and "+pwd+" Entered on username and password");
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() {
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Click on login button");
	}

	@Then("^I will see the welcome page$")
	public void i_will_see_the_welcome_page() {

		if (WebUtil.isElementExist(driver, By.linkText("PIM"))) {
			System.out.println("Welcome Page displayed");
		}else {
			System.out.println("welcome page not displayed");
		}
	}

	@When("^I click on PIM Link$")
	public void clickOnPIM() {
		driver.findElement(By.linkText("PIM")).click();
		System.out.println("clicked om PIM link");
	}

	@When("^I click on Add Employee link$")
	public void clickOnAddEmp() {
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Add Employee Link");
	}

	@Then("^I see Add Employee Page$")
	public void isAddEmployeePageDisplayed() {

		if (WebUtil.isElementExist(driver, By.id("firstName"))) {
			System.out.println("Add Employee Page displayed");
		}else {
			System.out.println("Add Employee Page not displayed");
		}
	}

	@When("^I enter firstname and lastname as (.*) and (.*)$")
	public void enterFirstNameAndLastName(String fName, String lName) {
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		System.out.println(fName+" entered on first name and "+lName+" entered on last name");
	}

	@When("^I click on Save button$")
	public void clickOnSaveButton() {
		driver.findElement(By.id("btnSave")).click();
		System.out.println("Clicked on save button");
	}

	@Then("^I should employee added$")
	public void isEmployeeAdeed() {

		if (WebUtil.isElementExist(driver,By.xpath("//h1[text()='Personal Details']"))) {
			System.out.println("Employee Added");
		}else {
			System.out.println("Failed to to add Employee ");
		}

	}

	@Then("^I will the close Browser$")
	public void i_will_the_close_Browser() {
		driver.quit();
		System.out.println("browser closed");
	}
	
	
	@When("I Add Employee with all details")
	public void addEmployee(DataTable tbl) {
		List<List<String>> data = tbl.asLists();
		//data.get(0).get(0);
	}
	
}









