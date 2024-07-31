
package com.luma.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.luma.base.TestBase;
import com.luma.pages.AddToWishlistPage;
import com.luma.pages.LoginPage;


public class AddToWishlistTest extends TestBase{
	LoginPage lp;
	AddToWishlistPage aw;
	
	@BeforeClass
	public void beforeMethod() throws InterruptedException {
		initialization();
		lp=new LoginPage();
		lp.clickOnSignIn();
		lp.login("john1234@gmail.com", "john@1234");
		aw = new AddToWishlistPage();
	}
	@Test(priority=1)
	public void clickOnGearTest() {
		aw.clickOnGear();
	}
	@Test(priority=2)
	public void clickOnBagsTest() {
		aw.clickOnBags();
	}
	@Test(priority=3)
	public void Features() {
		aw.Features();
	}
	
	@Test(priority=4)
	public void addToWishlistTest() {
		aw.addToWishlist();
	}
	@AfterClass
	public void afterMethod(){
		quit();
	}


}
