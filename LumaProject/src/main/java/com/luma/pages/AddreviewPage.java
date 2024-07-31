package com.luma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.TestBase;

public class AddreviewPage extends TestBase{
	@FindBy(id = "search") WebElement Input;
	@FindBy(id = "search_autocomplete") WebElement button;
	@FindBy(xpath="(//a[@class='action  next'])[2]") WebElement NextBtn;
	@FindBy(xpath = "//img[@alt='Logan  HeatTec® Tee']") WebElement Product;
	@FindBy(xpath = "//a[text()='Add Your Review']") WebElement AddReview;
	@FindBy (xpath ="//label[@title='4 stars']") WebElement Rating;
	@FindBy (id="nickname_field") WebElement Nickname;
	@FindBy (id="summary_field") WebElement Summary;
	@FindBy (id="review_field") WebElement Review;
	@FindBy (xpath = "//span[text()='Submit Review']") WebElement Submit;
	
	public AddreviewPage() {
		PageFactory.initElements(driver, this);
	}
	public void search(String in) {
		Input.sendKeys(in);
		button.click();
	}
	public void next() {
		NextBtn.click();
	}
	public void click() {
		Product.click();
	}
	public void addReview() {
		AddReview.click();
	}
}
