package com.luma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.TestBase;

public class AddToWishlistPage extends TestBase{
	@FindBy (xpath = "//span[contains(text(),'Gear')]") WebElement Gear;
	@FindBy (xpath = "(//a[contains(text(),'Bags')])[1]") WebElement Bags;
	@FindBy(xpath = "//div[contains(text(),'Features')]") WebElement Features;
	@FindBy(xpath = "//a[contains(text(),'Lightweight')]") WebElement LightWeight;
	@FindBy(xpath = "//div[contains(text(),'Price')]") WebElement Price;
	@FindBy(xpath = "(//ol[@class='items'])[8]//li[1]") WebElement Range;
	@FindBy(xpath = "//img[@alt='Savvy Shoulder Tote']") WebElement Img;
	@FindBy (xpath = "//a[@data-action='add-to-wishlist']") WebElement WishList;
	
	
	public AddToWishlistPage() {
		PageFactory.initElements(driver,this);
	}
	public void clickOnGear() {
		Gear.click();
	}
	public void clickOnBags() {
		Bags.click();
	}
	public void Features() {
		Features.click();
		LightWeight.click();
		Price.click();
		Range.click();
		Img.click();

}

	public void addToWishlist() {
		WishList.click();
	}

}
