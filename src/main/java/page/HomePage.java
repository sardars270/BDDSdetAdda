package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

	
	//page factory - OR
		@FindBy(xpath="//span[@class = 'user-display']")
		WebElement userNameDisplay;
		
		@FindBy(xpath="//span[contains(text(), 'Home')]")
		WebElement homeLink;
		
		@FindBy(xpath="//i[@class='home icon']")
		WebElement hometLinkHover;
		
		@FindBy(xpath="//span[contains(text(), 'Contacts')]")
		WebElement contactsLink;
		
		@FindBy(xpath="//i[@class='users icon']")
		WebElement contactLinkHover;
		
		@FindBy(xpath="//span[contains(text(), 'Contacts')]/following::i[1]")
		WebElement createNewContactsHoverLink;
		
		@FindBy(xpath="//span[contains(text(), 'Deals')]")
		WebElement dealsLink;
		
		@FindBy(xpath="//i[@class='money icon']")
		WebElement dealsLinkHover;
		
		
		
		
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
		
		public String verifyUserName() {
			
			return userNameDisplay.getText();
		}
		
		 
		
		public HomePage clickOnHomePageLink(){
			Actions action  = new Actions(driver);
			action.moveToElement(hometLinkHover);
			homeLink.click();
			return new HomePage();
		}
		
		public void clickOnContactsLink(){
			Actions action  = new Actions(driver);
			action.moveToElement(contactLinkHover);
			contactsLink.click();
			//return new ContactsPage();
		}
	
		public void clickOnCreateNewContactsHoverLink(){
			Actions action  = new Actions(driver);
			action.moveToElement(contactLinkHover);
			createNewContactsHoverLink.click();
			//return new ContactsPage();
		}
		/*
		public DealsPage clickOnDealsLink(){
			Actions action  = new Actions(driver);
			action.moveToElement(dealsLinkHover);
			dealsLink.click();
			return new DealsPage();
		}
		
		Feature: Home page Automation of CRM Demo

Background: User is already on logged in
Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on Login Button
Then User is navigated to Home Page

Examples:
| username | password |
| sardars270@gmail.com | Plasma12345@ |

Scenario Outline: Check Home Page Title
When verify home page title is "Cogmento CRM"
And Close the browser
		*/
	}

