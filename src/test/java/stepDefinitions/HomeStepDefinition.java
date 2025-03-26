package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.When;
import page.HomePage;

public class HomeStepDefinition {
	
	HomePage homePage = new HomePage();
	
		
	
	@When("verify home page title is {string}")
	public void verify_home_page_title_is(String string) {
	   System.out.println("verify home page title"+ homePage.verifyHomePageTitle()+ " hfdjgfdjg "+ string);
	   
	   Assert.assertEquals( homePage.verifyHomePageTitle(), string);
	   
	}

	
	
	@When("verify user name is {string}")
	public void verify_user_name_is(String string) {
		Assert.assertEquals( homePage.verifyUserName(), string, "User Name Does Not Matched");	
	
	}

	
	
	@When("verify home page link")
	public void verify_home_page_link() {
	    homePage.clickOnHomePageLink();
	}


}