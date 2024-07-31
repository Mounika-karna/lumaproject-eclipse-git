package com.luma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.base.TestBase;

public class CreateAccountPage extends TestBase {
	@FindBy(xpath="(//a[contains(text(),'Create an Account')])[1]") WebElement CreateAccount;
	@FindBy(id = "firstname") WebElement FirstName;
	@FindBy(id = "lastname") WebElement LastName;
	@FindBy(id = "email_address") WebElement Email;
	@FindBy(id = "password") WebElement Password;
	@FindBy(id = "password-confirmation") WebElement ConfirmPassword;
	@FindBy(xpath = "(//span[contains(text(),'Create an Account')])[1]") WebElement Create;
	
	
	public CreateAccountPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void AccountCreation(String fn,String ln,String e,String pw,String c) {
		CreateAccount.click();
		FirstName.sendKeys(fn);
		LastName.sendKeys(ln);
		Email.sendKeys(e);
		Password.sendKeys(pw);
		ConfirmPassword.sendKeys(c);
		Create.click();
	}
}
