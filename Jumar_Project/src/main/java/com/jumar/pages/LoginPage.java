package com.jumar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import basePage.BasePage;

public class LoginPage extends BasePage {
	
	static WebDriver driver;
	
	@FindBy(id = "email_create") 
	 WebElement txt_emailAddress;
	
	@FindBy(linkText = "Sign in") 
	 WebElement SignInBtn ;
	
	@FindBy(linkText = "Sign out") 
	 WebElement SignOutBtn ;
	
	
	@FindBy(id = "passwd") 
	 WebElement txt_password;
	
	@FindBy(id = "email") 
	 WebElement loginEmail;
	
	@FindBy(css = "#SubmitLogin > span") 
	 WebElement LoginSignInBtn;
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	public LoginPage enterEmail(String emailAddress) {
		
		loginEmail.sendKeys(emailAddress);
		return this;
	}
	
public LoginPage enterUserPassword(String password) {
		
		txt_password.sendKeys(password);
		return this;
	}

public void clickSignInButton() {
	
	SignInBtn.click();
}

public void clickSignOutButton() {
	
	SignOutBtn.click();
}

public void clickSubmitButton() {
	LoginSignInBtn.click();
}

	public HomePage login(String emailAddress, String password) {
		
		loginEmail.sendKeys(emailAddress);
		txt_password.sendKeys(password);
		return new HomePage(driver);
	}
	
	
	
	





}
