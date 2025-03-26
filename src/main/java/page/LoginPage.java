package page;

import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginPage  extends BaseTest{

	//WebDriver  driver;
	
	By txt_username = By.name("email");
	By txt_password = By.name("password");
	By loginButton = By.xpath("//div[contains(text(), 'Login')]");
	By userDisplay = By.xpath("//span[@class = 'user-display']");
	By forgotPassword = By.xpath("//a[contains(text(),'Forgot your password?')]");
	
	
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	public void openLoginPage() {
		driver.get("https://ui.cogmento.com/?lang=en");
	}	
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(loginButton));
	}
	
	public boolean verifyUsernameDisplayed() {
		//Assert.assertTrue(driver.findElements(userDisplay).size()>0, "User is navigated to Home Page");
		if(driver.findElements(userDisplay).size()>0) {
			return  true;
		}else return false;
		
	}
	
	public void clickForgotPassword() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(forgotPassword));
	}
	

	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}

