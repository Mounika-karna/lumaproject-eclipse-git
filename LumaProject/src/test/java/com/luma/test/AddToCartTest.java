package com.luma.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.luma.base.TestBase;
import com.luma.pages.AddToCartPage;
import com.luma.pages.LoginPage;


public class AddToCartTest extends TestBase{
	LoginPage lp;
	AddToCartPage ac;
	
	@BeforeClass
	public void beforeMethod() throws InterruptedException {
		initialization();
		lp=new LoginPage();
		lp.clickOnSignIn();
		lp.login("john1234@gmail.com", "john@1234");
		ac=new AddToCartPage();
	}
	@Test(priority=1)
	public void clickOnYogaTest() {
		ac.clickOnYoga();
	}
	@Test(priority=2)
	public void sortByTest() {
		ac.sortBy();
	}
	
	@Test(priority=3)
	public void addToCartTest() {
		ac.addToCart();
	}
	@Test(priority=4)
	public void verifyAddToCartTitleTest() {
		String Title = ac.verifyAddToCartTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Didi Sport Watch");
		
	}
	
	@AfterClass
	public void afterMethod(){
		quit();
	}


}
