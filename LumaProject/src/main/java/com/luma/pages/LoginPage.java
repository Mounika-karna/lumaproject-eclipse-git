package com.luma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]") WebElement SignIn;
	@FindBy(id="email") WebElement email;
	@FindBy(id="pass") WebElement password;
	@FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]") WebElement SignInbtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn() {
		SignIn.click();
	}
	
	public void login(String e,String pw) {
		email.sendKeys(e);
		password.sendKeys(pw);
		SignInbtn.click();
	}
	
	
}
