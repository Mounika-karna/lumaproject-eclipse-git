package com.luma.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.luma.base.TestBase;
import com.luma.pages.CreateAccountPage;


public class CreateAccountTest extends TestBase {
	CreateAccountPage ca;
	
	@BeforeClass
	public void beforeMethod() {
		initialization();
		ca = new CreateAccountPage();
	}
	
	@Test
	public void AccountCreationTest() throws InterruptedException {
		ca.AccountCreation("john", "1234", "john1234@gmail.com", "john@1234", "john@1234");
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void afterMethod(){
		quit();
	}

}
