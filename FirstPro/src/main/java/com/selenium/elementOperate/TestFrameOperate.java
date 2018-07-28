package com.selenium.elementOperate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils1;

public class TestFrameOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "chrome");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://localhost:5555/ecshop/admin");
    Thread.sleep(1000);
    driver.findElement(By.name("username")).sendKeys("administrator");
    driver.findElement(By.name("password")).sendKeys("a12345678");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    Thread.sleep(2000);
    driver.switchTo().frame("menu-frame");
    driver.findElement(By.partialLinkText("商品列表")).click();
    driver.switchTo().defaultContent();
    driver.switchTo().frame("header-frame");
    driver.findElement(By.partialLinkText("帮助")).click();
    Thread.sleep(5000);
    driver.quit();
	}

}
