package com.luma.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
		public static WebDriver driver;
		
		public void initialization() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30000));
         driver.get("https://magento.softwaretestingboard.com/");
		}
		
		public void quit() {
			driver.quit();
		}
		
}
