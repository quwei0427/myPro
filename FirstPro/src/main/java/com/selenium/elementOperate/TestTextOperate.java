package com.selenium.elementOperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils1;

public class TestTextOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "firefox");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
    Thread.sleep(1000);
    driver.findElements(By.className("type1")).get(0).sendKeys("abcde");
    Thread.sleep(1000);
    driver.quit();
	}

}
