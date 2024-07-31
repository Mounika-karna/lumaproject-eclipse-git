package com.luma.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.TestBase;

public class OpenWishlistPage extends TestBase{
	//@FindBy (xpath = "(//a[text()='My Wish List '])[1]") WebElement MyWishlist;
	@FindBy (xpath="(//button[@type='button'])[1]") WebElement Welcome;
	@FindBy(xpath = "(//ul[@class='header links'])[1]//li//a") List<WebElement> options;
	
	public OpenWishlistPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void  myWishlist() throws InterruptedException {
		Thread.sleep(2000);
		Welcome.click();
		for(WebElement option : options) {
			String optiontext = option.getText();
			System.out.println(optiontext);
			if(optiontext.equals("My Wish List 1 item")) {
				option.click();
				break;
			}
			
		}
	}

}
