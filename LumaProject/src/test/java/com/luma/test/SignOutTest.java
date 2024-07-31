package com.luma.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.base.TestBase;
import com.luma.pages.LoginPage;
import com.luma.pages.SignOutPage;


public class SignOutTest extends TestBase {
	LoginPage lp;
	SignOutPage sp;
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		initialization();
		lp=new LoginPage();
		lp.clickOnSignIn();
		lp.login("john1234@gmail.com", "john@1234");
		sp = new SignOutPage();
	}
	
	@Test
	public void signOutTest() throws InterruptedException {
		Thread.sleep(2000);
		sp.SignOut();
		
	}
	@AfterMethod
	public void afterMethod(){
		quit();
	}


}
