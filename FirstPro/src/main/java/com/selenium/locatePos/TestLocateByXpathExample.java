package com.selenium.locatePos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils1;

public class TestLocateByXpathExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils1.getDriver();
		driver.get("http://bbs.51testing.com/forum.php");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();	
		Thread.sleep(5000);
//		List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
//		list.get(0).click();
		List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]"));
		list.get(0).findElement(By.xpath("tr/th/a[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		Thread.sleep(5000);
		// 以下这一步必须要有，需要重新更新获取一下元素List才可以，因为上面已经动过了，否则获取不到
		list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(1).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
