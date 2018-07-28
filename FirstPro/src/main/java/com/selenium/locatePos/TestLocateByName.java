package com.selenium.locatePos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils1;

public class TestLocateByName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "firefox");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://www.baidu.com");
//    driver.findElement(By.id("kw")).sendKeys("selenium");
    driver.findElement(By.name("wd")).sendKeys("selenium");
    Thread.sleep(1000);
    driver.quit();
	}

}
