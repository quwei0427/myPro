package com.selenium.locatePos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils1;

public class TestLocateByTagName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils1.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
		driver.findElement(By.partialLinkText("检查情况")).click();
		for (int i = 0; i <= 3; i++) {
			driver.findElement(By.id("tianjia_buttoncdqk")).click();
		}
	     WebElement table=driver.findElement(By.id("ctqk"));
//	     System.out.println(table.findElements(By.tagName("tr")).size());//获取 表格的行数
	     System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("td")).size());
	     //获取列数
	     table.findElements(By.tagName("tr")).get(3).findElements(By.tagName("td"))
	     .get(1).findElements(By.tagName("input")).get(1).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
