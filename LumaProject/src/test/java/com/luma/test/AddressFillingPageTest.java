package com.luma.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.luma.base.TestBase;
import com.luma.pages.AddressFillingPage;
import com.luma.pages.LoginPage;

public class AddressFillingPageTest  extends TestBase{
	LoginPage lp;
	AddressFillingPage af;
	
	@BeforeClass
	public void beforeMethod() throws InterruptedException {
		initialization();
		lp=new LoginPage();
		lp.clickOnSignIn();
		lp.login("john1234@gmail.com", "john@1234");
		af = new AddressFillingPage();
	}
	@Test(priority=1)
	public void clickOnWelcomeTest() throws InterruptedException {
		af.clickOnWelcome();
	}
	@Test(priority=2)
	public void clickOnAddressTest() {
		af.clickOnAddress();
	}
	@Test(priority=3)
	public void saveAddressTest() throws InterruptedException {
		af.saveAddress("India", 9123586, "GandhiNagar", "Bangalore", "Karnataka",12345);
	}

	@AfterClass
	public void afterMethod() {
		quit();
	}
	
}
