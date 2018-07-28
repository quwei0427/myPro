package com.utils;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public WebDriver driver;
	public Config config=new Config("config.properties");
	@BeforeSuite
	public void beforeSuite() {
		String  bowserType=config.getConfig("browserType");
		System.setProperty("browser.type", bowserType);
		DriverUtils.initService();
	}

	@AfterSuite
	public void afterSuite() {
		DriverUtils.stopService();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver= DriverUtils.getDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
