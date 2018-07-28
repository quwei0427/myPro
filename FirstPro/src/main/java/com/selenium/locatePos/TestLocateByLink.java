package com.selenium.locatePos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils1;

public class TestLocateByLink {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "firefox");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://localhost:5555/ecshop");
//    driver.findElement(By.linkText("请登录")).click();//linkText要把所有的链接文本写上去
    driver.findElement(By.partialLinkText("登录")).click();//partialLinkText只要把部份链接文本写上去就可以了
    Thread.sleep(1000);
    driver.quit();
	}

}
