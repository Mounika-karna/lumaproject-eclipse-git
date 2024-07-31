package com.luma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.TestBase;

public class HoodiesPage extends TestBase{
	@FindBy(xpath = "//span[contains(text(),'Sale')]") WebElement Sale;
	@FindBy(xpath = "(//a[text()='Hoodies and Sweatshirts'])[1]") WebElement hoodiesbtn;
	@FindBy(xpath = "(//img[@alt='Autumn Pullie'])[2]") WebElement Image;
	@FindBy(xpath = "//div[text()='S']") WebElement Size;
	@FindBy(xpath = "//div[@option-label='Red']") WebElement Colour;
	@FindBy(xpath = "//button[@title='Add to Cart']") WebElement AddToCart;
	
	public HoodiesPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnSale() {
		Sale.click();
	}
	public void clickOnHoodies(){
		hoodiesbtn.click();
	}
	
	public void selectProduct(){
		Image.click();
		Size.click();
		Colour.click();
	}
	public void addToCart() {
		AddToCart.click();
	}	

}
