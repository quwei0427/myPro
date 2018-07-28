package com.selenium.elementOperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utils.DriverUtils1;

public class TestMouseOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "chrome");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@name='vcGgyy' and @value='3']")).click();
    Thread.sleep(5000);
    Actions actions=new Actions(driver);
    actions.doubleClick(driver.findElement(By.xpath("//input[@name='vcGgyy' and @value='3']"))).perform();
    Thread.sleep(5000);
    driver.quit();
	}

}
