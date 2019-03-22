package com.jumar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class CreateAccountPage extends BasePage {
	
	static WebDriver driver;
	
	@FindBy(id = "email_create") 
	 WebElement txt_Email;
	
	@FindBy(css = "#SubmitCreate > span") 
	 WebElement createAccountButton;
	
	@FindBy(css = "#center_column > p")
	WebElement verifyAccountCreated;
	
	
	
	
public CreateAccountPage(WebDriver driver) 
	{
		
		super(driver);
	}


public CreateAccountPage enterEmailAddress(String email) {
	
	txt_Email.sendKeys(email);
	return this;
	
}

public DetailsPage clickCreateAnAccountButton() {
	
	createAccountButton.click();
	return new DetailsPage(driver);
	
}

public String verifyAccountIsCreated()
{
	String text = verifyAccountCreated.getText();
	return text;
	
}




}
