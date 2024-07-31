package com.luma.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.luma.base.TestBase;
import com.luma.pages.HoodiesPage;
import com.luma.pages.LoginPage;


public class HoodiesPageTest extends TestBase{
	LoginPage lp;
	HoodiesPage hp;
	
	@BeforeClass
	public void beforeMethod() {
		initialization();
		lp=new LoginPage();
		lp.clickOnSignIn();
		lp.login("john1234@gmail.com", "john@1234");
		hp = new HoodiesPage();
	}
	
	@Test(priority=1)
	public void clickOnSaleTest() {
		hp.clickOnSale();
	}
	@Test(priority=2)
	public void clickOnHoodiesTest(){
		hp.clickOnHoodies();
	}
	@Test(priority=3)
	public void selectProductTest(){
		hp.selectProduct();
	}
	@Test(priority=4)
	public void addToCartTest(){
		hp.addToCart();
	}
	
	@AfterClass
	public void afterMethod(){
		quit();
	}

}
