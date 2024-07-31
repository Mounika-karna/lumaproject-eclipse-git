package com.luma.test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.luma.base.TestBase;
import com.luma.pages.LoginPage;


public class LoginPageTest extends TestBase{
	LoginPage lp;
	
	@BeforeClass
	public void beforeMethod() {
		initialization();
		lp=new LoginPage();
	}
	
	@Test(priority=1)
	public void clickOnSignInTest() {
		lp.clickOnSignIn();
	}
	
	
	@Test(priority=2)
	public void loginTest() throws InterruptedException {
		lp.login("john1234@gmail.com", "john@1234");
		Thread.sleep(2000);
	}
	
	
	
	@AfterClass
	public void afterMethod(){
		quit();
	}

}
