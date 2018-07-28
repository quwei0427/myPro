package com.selenium.locatePos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils1;

public class TestLocateByXpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "chrome");
		WebDriver driver = DriverUtils1.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
		driver.findElement(By.xpath("//input[@name='dtDyjsrq' ]/following-sibling::img")).click();	
		Thread.sleep(2000);
		driver.quit();
	}

}
