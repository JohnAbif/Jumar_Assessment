package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jumar.pages.CreateAccountPage;
import com.jumar.pages.DetailsPage;
import com.jumar.pages.ExpensiveDressPage;
import com.jumar.pages.HomePage;
import com.jumar.pages.LoginPage;
import com.jumar.pages.LogoutCartPage;

import basePage.BasePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

//@Listeners(ListernerTest.class)

public class CreateAccountStepDefinition {

	private static WebDriver driver;
	private LoginPage login;
	private HomePage home;
	private DetailsPage details;
	private ExpensiveDressPage dress;
	private LogoutCartPage cart;
	private CreateAccountPage createAccount;
	 
	 
	
	 
	 
	

	 @Given("^that user has navigated to the web application$")
	 public void that_user_has_navigated_to_the_web_application() throws Throwable {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php");
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("http://automationpractice.com/index.php");
	 }

	 @Given("^user has clicked on the Sign in link$")
	 public void user_has_clicked_on_the_Sign_in_link() throws Throwable {
		 
		 login = new LoginPage(driver);
		 login.clickSignInButton();
	     
		 
	 }

	 @Given("^enters email address in the create account section$")
	 public void enters_email_address_in_the_create_account_section() throws Throwable {
		 
		 createAccount = new CreateAccountPage(driver);
		 createAccount.enterEmailAddress("hive91@day.com");
	     
	 }

	 @Given("^clicks on 'Create an Account' button$")
	 public void clicks_on_Create_an_Account_button() throws Throwable {
		 
		 createAccount.clickCreateAnAccountButton();
	 }

	 @Given("^user successfully fills out the details form$")
	 public void user_successfully_fills_out_the_details_form() throws Throwable {
		 
		 
		 details = new DetailsPage(driver);
		 details.SelectGender();
		 details.enterRegistrationDetails("John","Abif","hive91@day.com", "Autumn2014!");
		 details.enterDayOfBirth();
		 details.enterMonthOfBirth();
		 details.enterYearOfBirth();
		 
		 details.enterYourAddressDetails();
		 
		 
	 }

	 @When("^user clicks on the 'Register' button$")
	 public void user_clicks_on_the_Register_button() throws Throwable {
		 
		 details.clickOnRegisterButton();
		 
	    
	 }

	 @Then("^user's account would be created successfully$")
	 public void user_s_account_would_be_created_successfully() throws Throwable {
		 
		 String expectedText ="Welcome to your account. Here you can manage all of your personal information and orders.";
	     String ActualText = createAccount.verifyAccountIsCreated();
	     Assert.assertEquals(expectedText, ActualText);
	 }

	 @Then("^user is able to log in with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_is_able_to_log_in_with_valid_and(String emailaddress, String password) throws Throwable {
		 
		 login.clickSignOutButton();
		 login.clickSignInButton();
		 login.login(emailaddress, password);
		 login.clickSubmitButton();
	     
	 }

	 @Then("^find the most expensive dress$")
	 public void find_the_most_expensive_dress() throws Throwable {
		 
		 dress = new ExpensiveDressPage(driver);
		 dress.clickDressessLink();
		 JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript("window.scrollBy(0,1000)");
		 
	    
	 }

	 @Then("^add it to the cart$")
	 
	 public void add_it_to_the_cart() throws Throwable {
		 
		 //dress.clickOnItem();
		 Actions builder = new Actions(driver);
		 WebElement element = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive' and @src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']"));
		 builder.moveToElement(element).build().perform();
		 dress.addToCart();
		 Thread.sleep(5000);
		 dress.clickOnCheckoutButton();
		 
		 //String actual = dress.verifyDressIsAddedToCart();
		 //Assert.assertEquals("Product successfully added to your shopping cart", actual);
		 
		 	     
	 }

	 @Then("^logs out successfully$")
	 public void logs_out_successfully() throws Throwable {
	  
		login.clickSignOutButton(); 
	 }


     @Then("^user is able to log back in successfully with valid \"([^\"]*)\" and \"([^\"]*)\"$")
     public void user_is_able_to_log_back_in_successfully_with_valid_and(String emailAddress, String password) throws Throwable {
    
    	 login.clickSignInButton();
		 login.login(emailAddress, password);
		 login.clickSubmitButton();
    }

	 @Then("^ensure that the dress is still in the cart\\.$")
	 public void ensure_that_the_dress_is_still_in_the_cart() throws Throwable {
	   
		 boolean itemInCart = dress.verifyItemIsInCart();
		 Assert.assertTrue(itemInCart);
	 }
	 
	

}
