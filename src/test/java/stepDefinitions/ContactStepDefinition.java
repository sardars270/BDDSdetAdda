package stepDefinitions;

import io.cucumber.java.en.Then;
import page.ContactPage;
import page.HomePage;

public class ContactStepDefinition {

	HomePage homePage = new HomePage();
	ContactPage contactPage = new ContactPage();
	
	
	@Then("User is navigated to Contact Page")
	public void user_is_navigated_to_contact_page() {
	  homePage.clickOnContactsLink();
	}
		
	
	@Then("select contact by name {string}")
	public void select_contact_by_name(String string) {
	    contactPage.selectContactsByName(string);
	}

	
	@Then("Click on create new contact hover link")
	public void click_on_create_new_contact_hover_link() {
		homePage.clickOnCreateNewContactsHoverLink();
	}
	
	@Then("Enter {string} , {string} and {string}")
	public void enter_and(String firstName, String lastname, String source) {
		contactPage.createNewContact(firstName, lastname, source);
	    
	}
	
	@Then("Click on save Button")
	public void click_on_save_button() {
	   contactPage.clickOnCreateNewContactSaveButton();
	}


}
