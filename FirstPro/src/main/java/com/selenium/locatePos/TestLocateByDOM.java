package com.selenium.locatePos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utils.DriverUtils1;

public class TestLocateByDOM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils1.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		jsExecutor.executeScript("document.getElementsByName('dtDyjsrq')[0].parentNode.childNodes[2].click()");
		Thread.sleep(5000);		
		driver.quit();
	}

}
