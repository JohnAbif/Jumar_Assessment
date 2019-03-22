package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	protected static WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		BasePage.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public static String getPageTitle() 
	{
		return driver.getTitle();
	}
	
	public boolean isTextDisplayed(String text) {
		
		return driver.getPageSource().contains(text);
		
	}
	

	
	
	






}
