package com.jumar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.BasePage;

public class ExpensiveDressPage extends BasePage {
	
	
	
	@FindBy(linkText="DRESSES")
	WebElement dressLinkText;
	
	@FindBy(css="#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-item-of-tablet-line.hovered > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")
	WebElement addToCartButton;
	
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")
	WebElement dressAddedToCart;
	
	@FindBy(css= "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")
	WebElement checkoutButton;
	
	@FindBy(css= "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a > span.ajax_cart_quantity")
	WebElement checkItemIsInCart;
	
	@FindBy(xpath= "//img[@class='replace-2x img-responsive' and @src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']")
	WebElement clickOnDress;
	
	
public ExpensiveDressPage(WebDriver driver) {
		
		super(driver);
	}

	public void clickDressessLink() {
		
		dressLinkText.click();
	}
	
    public void clickOnItem() {
		
		clickOnDress.click();
		
	}
	
	public void addToCart() {
		
		addToCartButton.click();
	}
	
	public String verifyDressIsAddedToCart() {
		
		return dressAddedToCart.getText();
	}
	
	public void clickOnCheckoutButton() {
		
		checkoutButton.click();
	}

        public boolean verifyItemIsInCart() {
		
		return checkItemIsInCart.isDisplayed();
	}
	
}
