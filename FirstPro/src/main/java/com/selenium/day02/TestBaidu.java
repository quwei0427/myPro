package com.selenium.day02;

import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils1;

public class TestBaidu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "firefox");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://www.baidu.com");
    driver.quit();
	}

}
