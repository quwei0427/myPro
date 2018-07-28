package com.selenium.day01;

import java.io.File;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

public class BaiduFirefox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:/driver/geckodriver.exe");
		 FirefoxOptions options = new FirefoxOptions()
			      .addPreference("browser.startup.page", 1)
			      .addPreference("browser.startup.homepage", "http://www.baidu.com");
	    WebDriver driver = new FirefoxDriver(options);
		
	}

}
