package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage  extends BaseTest {
	
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']/span")
	WebElement contactsLabel;
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(xpath = "//label[contains(text(),'Source')]/following-sibling::div")
	WebElement sourceDropdown;
	
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveBtn;

	
	// Initializing the Page Objects:
		public ContactPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		public boolean verifyContactsLabel(){
			return contactsLabel.isDisplayed();
		}
		
		
		public void selectContactsByName(String name){
			driver.findElement(By.xpath("//a[contains(text(), '"+name+"')]/../following-sibling::td[1]")).click();
		}
		
		
		public void createNewContact(String ftName, String ltName, String source){
			firstName.sendKeys(ftName);
			lastName.sendKeys(ltName);
			sourceDropdown.click();
			driver.findElement(By.xpath("//span[contains(text(),'"+source+"')]")).click();
			
			
		}
		
		public void clickOnCreateNewContactSaveButton() {
			saveBtn.click();
		}
		
}
