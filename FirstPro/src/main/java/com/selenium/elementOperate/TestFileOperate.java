package com.selenium.elementOperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils1;

public class TestFileOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "chrome");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
    Thread.sleep(1000);
    driver.findElement(By.name("vcWjSc")).sendKeys("c:\\my.txt");
    Thread.sleep(5000);
    driver.quit();
	}

}
