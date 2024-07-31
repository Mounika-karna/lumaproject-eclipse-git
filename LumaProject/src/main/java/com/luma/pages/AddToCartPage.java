package com.luma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.luma.base.TestBase;

public class AddToCartPage extends TestBase{
	@FindBy (xpath="//span[text()='Shop New Yoga']") WebElement Yoga;
	@FindBy(id="sorter") WebElement SortBy;
	@FindBy(xpath="(//a[@class='product photo product-item-photo'])[4]") WebElement Watch;
	@FindBy(id = "product-addtocart-button") WebElement Add;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyAddToCartTitle() {
		return driver.getTitle();
	}
	public void clickOnYoga() {
		Yoga.click();
	}
	public void sortBy() {
		Select s = new Select(SortBy);
		s.selectByIndex(1);
		Watch.click();
		
	}
	
	public void addToCart() {
		Add.click();
	}

}
