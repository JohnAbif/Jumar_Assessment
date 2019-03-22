package com.jumar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



import basePage.BasePage;

public class DetailsPage extends BasePage {
	
	static WebDriver driver;
	
	@FindBy(id = "id_gender1") 
	 WebElement MrRadioButton;
	
	@FindBy(id = "customer_firstname") 
	 WebElement txt_customerFirstName;
	
	@FindBy(id = "customer_lastname") 
	 WebElement txt_customerLastName;
	
	@FindBy(id = "email") 
	 WebElement details_email;
	
	@FindBy(id = "passwd") 
	 WebElement details_password;
	
	@FindBy(id="days")
	WebElement select_day_of_birth;
	
	@FindBy(id="months")
	WebElement select_month;
	
	@FindBy(id="years")
	WebElement select_year_of_birth;
	
	@FindBy(id="firstname")
	WebElement first_name_address;
	
	@FindBy(id="lastname")
	WebElement last_name_address;
	
	@FindBy(id="company")
	WebElement company_name;
	
	@FindBy(id="address1")
	WebElement first_address;
	
	@FindBy(id="address2")
	WebElement second_address;
	
	@FindBy(id="city")
	WebElement city_address;
	
	@FindBy(id="id_state")
	WebElement select_city;
	
	@FindBy(id="postcode")
	WebElement enter_postcode;
	
	@FindBy(id="id_country")
	WebElement select_country;
	
	@FindBy(id="other")
	WebElement additional_information;
	
	@FindBy(id="phone")
	WebElement home_number;
	
	@FindBy(id="phone_mobile")
	WebElement mobile_number;
	
	@FindBy(id="alias")
	WebElement alias_address;
	
	@FindBy(css="#submitAccount > span")
	WebElement registerBtn;
	
	
public DetailsPage(WebDriver driver) 
	{
		
		super(driver);
	}


public void SelectGender() {
	MrRadioButton.click();
}

public DetailsPage enterRegistrationDetails(String firstname, String lastname, String email, String password)
{
	
	txt_customerFirstName.clear();
	txt_customerFirstName.sendKeys(firstname);
	txt_customerLastName.clear();
	txt_customerLastName.sendKeys(lastname);
	details_email.clear();
	details_email.sendKeys(email);
	details_password.clear();
	details_password.sendKeys(password);
	
	return this;
	
}

  public void enterDayOfBirth() {
	
	Select day = new Select(select_day_of_birth);
	day.selectByIndex(12);
	
	
  }
  
  public void enterMonthOfBirth() {
		
		
		Select month = new Select(select_month);
		month.selectByIndex(6);
	  }
  
  public void enterYearOfBirth() {
		
		Select year = new Select(select_year_of_birth);
		year.selectByIndex(30);
		
	  }
  
  public DetailsPage enterYourAddressDetails() {
	  
	  first_name_address.clear();
	  first_name_address.sendKeys("John");
	  last_name_address.clear();
	  last_name_address.sendKeys("Abif");
	  company_name.clear();
	  company_name.sendKeys("ATX Ltd");
	  first_address.clear();
	  first_address.sendKeys("11 James Street");
	  second_address.clear();
	  second_address.sendKeys("Cavendish Square");
	  city_address.clear();
	  city_address.sendKeys("London");
	  
	  Select city = new Select(select_city);
	  city.selectByIndex(3);
	  enter_postcode.clear();
	  enter_postcode.sendKeys("90210");
	  
	  Select country = new Select(select_country);
	  country.selectByVisibleText("United States");
	  additional_information.sendKeys("Test");
	  home_number.clear();
	  home_number.sendKeys("367920038");
	  mobile_number.clear();
	  mobile_number.sendKeys("2287300029");
	  alias_address.clear();
	  alias_address.sendKeys("Pink Panther");
	  
	  return this;
  }
	 
	  
	public void clickOnRegisterButton() {
		
		registerBtn.click();
		
	}
	  
			  
	  
	  
	  







  
}
