package com.luma.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.TestBase;

public class SignOutPage extends TestBase{
	@FindBy(xpath = "(//button[@type='button'])[1]") WebElement Welcome;
	@FindBy(xpath = "(//ul[@class='header links'])[1]//li//a") List<WebElement> options;

public SignOutPage() {
	PageFactory.initElements(driver, this); 
}


public void SignOut() throws InterruptedException {
	Thread.sleep(2000);
	Welcome.click();
	for(WebElement option : options) {
		String optiontext = option.getText();
		if(optiontext.equals("Sign Out")) {
			option.click();
			break;
		}
		
	}
	
}

}
