package com.selenium.elementOperate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utils.DriverUtils1;

public class TestMouseOperate1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "firefox");
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
    Actions actions=new Actions(driver);
//    actions.moveToElement(driver.findElement(By.partialLinkText("个人设置"))).pause(8000).perform();
//    actions.moveToElement(driver.findElement(By.linkText("退出"))).click().perform();
    actions.moveToElement(driver.findElement(By.partialLinkText("个人设置")))
    .moveToElement(driver.findElement(By.linkText("退出"))).click().perform();
    Thread.sleep(5000);
    driver.quit();
	}

}
