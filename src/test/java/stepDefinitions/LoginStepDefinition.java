package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginStepDefinition {

	WebDriver  driver;
	LoginPage loginPage = new LoginPage();

	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	   System.out.println("\"User is on login page");
	   loginPage.openBrowser();
	   loginPage.openLoginPage();
	}
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		System.out.println("User enters valid username and password");
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}
	
	@When("Clicks on Login Button")
	public void clicks_on_login_button() {
		System.out.println("Clicks on Login Button");
		loginPage.clickLogin();
	}
	
	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
		System.out.println( loginPage.verifyUsernameDisplayed());
		
		Assert.assertTrue( loginPage.verifyUsernameDisplayed(), "User is navigated to Home Page");
	}
	
	
	@When("Clicks on Forgot Password Button")
	public void clicks_on_forgot_password_button() {
	   loginPage.clickForgotPassword();
	}

	@Then("User is navigated to Forgot Password Page")
	public void user_is_navigated_to_forgot_password_page() {
	   System.out.println("On Forgot Password Page...");
	}

	
	
	@Then("Close the browser")
	public void close_the_browser() {
		System.out.println("Close the browser");
		loginPage.closeBrowser();
	}
	
	

	@After
	public void embedScreenshot(Scenario scenario) {

		if(scenario.isFailed()) {

		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(screenshot, "image/png", "/Users/barinderthind/Desktop/QA/Cucumber/CucumberWorkspace/BDDSdetAdda/target/Screenshot");
		System.out.println("out");
		
	
		}

		}

}
