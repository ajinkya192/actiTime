package sdet.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import sdet.pages.LoginPage;
import testbase.TestBase;

public class LoginTest extends TestBase {
	
	LoginPage loginpage; 
	
	@BeforeMethod
	public void Setup() {
		initailization();
		loginpage = new LoginPage();
	}
	
	@Test
	public void ValidLogin() {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void closeup() {
		driver.close();
	}
	

}
