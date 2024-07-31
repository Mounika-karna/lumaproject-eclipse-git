package com.luma.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.luma.base.TestBase;
import com.luma.pages.CheckOutPage;
import com.luma.pages.LoginPage;

public class CheckoutPageTest extends TestBase{
		LoginPage lp;
		CheckOutPage cp;
		
		@BeforeClass
		public void beforeMethod() throws InterruptedException {
			initialization();
			lp=new LoginPage();
			lp.clickOnSignIn();
			lp.login("john1234@gmail.com", "john@1234");
			cp = new CheckOutPage();
		}
		@Test(priority=1)
		public void clickOnGearTest() {
			cp.clickOnGear();
		}
		@Test(priority=2)
		public void clickOnFitnessTest() {
			cp.clickOnFitness();
		}
		@Test(priority=3)
		public void clickOnImgTest(){
			cp.clickOnImg();
		}
		@Test(priority=4)
		public void addToCartTest() {
			cp.addToCart();
		}
		@Test(priority=5)
		public void clickOnCartTest(){
			cp.clickOnCart();
		}
		
		@Test(priority=6)
		public void clickOnCheckOutTest(){
			cp.clickOnCheckOut();
		}
		@Test(priority=7)
		public void clickOnNextTest() throws InterruptedException{
			cp.clickonNext();
		}
		@Test(priority=8)
		public void clickOnPlaceTest() throws InterruptedException{
			cp.clickOnPlace();
		}
		@AfterClass
		public void afterMethod(){
			quit();
		}

}
