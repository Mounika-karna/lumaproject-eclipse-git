package com.luma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.TestBase;


public class CheckOutPage extends TestBase{
	@FindBy(xpath ="//span[text()='Gear']") WebElement Gear;
	@FindBy(xpath ="(//a[text()='Fitness Equipment'])[1]") WebElement Fitness;
	@FindBy(xpath ="//img[@alt='Harmony Lumaflex™ Strength Band Kit ']") WebElement Img;
	@FindBy(id ="product-addtocart-button") WebElement AddtoCart;
	@FindBy(xpath = "//a[@class='action showcart']") WebElement Cart;
	@FindBy(xpath = "//button[text()='Proceed to Checkout']") WebElement Checkout;
	@FindBy(xpath = "//button[@class='button action continue primary']") WebElement Nextbtn;
	@FindBy(xpath = "//span[text()='Place Order']") WebElement Placebtn;
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnGear() {
		Gear.click();;
	}
	public void clickOnFitness() {
		Fitness.click();
	}
	public void clickOnImg() {
		Img.click();
	}
	public void addToCart(){
		AddtoCart.click();
	}
	public void clickOnCart() {
		Cart.click();
	}
	
	public void clickOnCheckOut() {
		Checkout.click();
	}
	public void clickonNext() throws InterruptedException {
		Thread.sleep(5000);
		Nextbtn.click();
	}
	public void clickOnPlace() throws InterruptedException {
		Thread.sleep(10000);
		Placebtn.click();
	}

}

