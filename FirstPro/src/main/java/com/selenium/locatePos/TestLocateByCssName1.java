package com.selenium.locatePos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils1;

public class TestLocateByCssName1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "firefox");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://www.taobao.com");
    Thread.sleep(2000);
    System.out.println(driver.findElements(By.className("btn-login")).size());
    Thread.sleep(1000);
    driver.quit();
	}

}
