package com.selenium.elementOperate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils1;

public class TestRadioCheckboxOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils1.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
		Thread.sleep(1000);
		List<WebElement> radios = driver.findElements(By.xpath("//input[@name='vcGgyy' and @value<=5]"));
		for (WebElement radio : radios) {//第一种方式 遍历选 框
			Thread.sleep(1000);
			radio.click();
		}
		driver.findElement(By.xpath("//input[@name='vcGgyy' and @value='3']")).click();
		Thread.sleep(1000);
		for (WebElement radio : radios) {
			if (radio.isSelected()) {// 单选框，复选 框是否选中，一种写法
				System.out.println("选中的值1是" + radio.getAttribute("value"));
				break;
			}
		}
		for (WebElement radio : radios) {
			if (radio.getAttribute("checked") != null) {// 单选框，复选 框是否选中，第2种写法
				System.out.println("选中的值2是" + radio.getAttribute("value"));
				break;
			}
		}
		List<WebElement> checks = driver.findElements(By.name("vcJsfs"));
		for (int i = 0; i < checks.size(); i++) {
			if (i % 2 != 0) {
				Thread.sleep(1000);
				checks.get(i).click();
			}
		}
		for (int i = 0; i < checks.size(); i++) {//第2种方式 遍历选 框
			if (i % 2 != 0) {
				Thread.sleep(1000);
				if (checks.get(i).getAttribute("checked") != null) {
					System.out.print("选中的值有" + checks.get(i).getAttribute("value") + ",");
				}
			}
		}

		for (int i = 0; i < checks.size(); i++) {
			Thread.sleep(1000);
			if (checks.get(i).getAttribute("checked") != null) {
				checks.get(i).click();//取消选择
			}

		}
		Thread.sleep(5000);
		driver.quit();
	}

}
