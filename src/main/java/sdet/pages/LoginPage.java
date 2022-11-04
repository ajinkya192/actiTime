package sdet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase{
	
	// Element Repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(id="loginButton")
	WebElement loginbutton;
	
	
	//Element Initialize
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public void login(String un, String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		
	}

}
