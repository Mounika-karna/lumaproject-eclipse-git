package com.luma.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.luma.base.TestBase;
import com.luma.pages.LoginPage;
import com.luma.pages.AddreviewPage;

public class AddReviewTest extends TestBase{
	LoginPage lp;
	AddreviewPage sr;
	
	@BeforeClass
	public void beforeMethod() {
		initialization();
		lp=new LoginPage();
		lp.clickOnSignIn();
		lp.login("john1234@gmail.com", "john@1234");
		sr = new AddreviewPage();
	}
	@Test(priority=1)
	public void searchTest() {
		sr.search("Tees and Tops");
	}
	@Test(priority=2)
	public void nextTest() {
		sr.next();
	}
	@Test(priority=3)
	public void clickTest() {
		sr.click();
	}
	@Test(priority=4)
	public void addReviewTest() {
		sr.addReview();
	}
	
	@AfterClass
	public void afterMethod(){
		quit();
	}

}
