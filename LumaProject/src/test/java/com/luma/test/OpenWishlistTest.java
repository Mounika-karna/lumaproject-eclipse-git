package com.luma.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.luma.base.TestBase;
import com.luma.pages.LoginPage;
import com.luma.pages.OpenWishlistPage;

public class OpenWishlistTest extends TestBase {
	LoginPage lp;
	OpenWishlistPage op;
	
	@BeforeClass
	public void beforeMethod() throws InterruptedException {
		initialization();
		lp=new LoginPage();
		lp.clickOnSignIn();
		lp.login("john1234@gmail.com", "john@1234");
		op=new OpenWishlistPage();
	}
	
	@Test
	public void myWishlisttest() throws InterruptedException {
		Thread.sleep(5000);
		op.myWishlist();
		
	}
	@AfterClass
	public void afterMethod(){
		quit();
	}

}
