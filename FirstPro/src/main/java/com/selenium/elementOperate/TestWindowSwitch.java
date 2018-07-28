package com.selenium.elementOperate;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.xml.serializer.utils.StringToIntTable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.utils.DriverUtils1;

public class TestWindowSwitch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils1.getDriver();
		driver.get("http://bbs.51testing.com/forum.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();	
		Thread.sleep(2000);
		String firstHandle=driver.getWindowHandle();//获取 第一个窗口id
//		List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
//		list.get(0).click();
		//这种方式也可以写，分两次获取到这个元素
		List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]"));
		list.get(0).findElement(By.xpath("tr/th/a[3]")).click();
		Thread.sleep(2000);
		//获取 第二个窗口id
		Set<String> windowsSet=driver.getWindowHandles();
		String secondHandle="";
		for(String handle:windowsSet) {
			if(!handle.equals(firstHandle)) {
				secondHandle=handle;
				break;
			}
		}
//		Set<String> secondWindowSet=driver.getWindowHandles();
		driver.switchTo().window(firstHandle);
//		driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		Thread.sleep(2000);
	
		// 以下这一步必须要有，需要重新更新获取一下元素List才可以，因为上面已经动过了，否则获取不到
		list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(1).click();
		Thread.sleep(2000);
		windowsSet=driver.getWindowHandles();
		String thirdHandle="";
		for(String handle:windowsSet) {
			if(!handle.equals(firstHandle)&&!handle.equals(secondHandle)) {
				thirdHandle=handle;
				break;
			}
		}
		System.out.println(firstHandle);
		System.out.println(secondHandle);
		System.out.println(thirdHandle);
		
		driver.switchTo().window(firstHandle);
//		driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(2).click();
		Thread.sleep(2000);
		String fourHandle="";
		windowsSet=driver.getWindowHandles();
		for(String handle:windowsSet) {
			if(!handle.equals(firstHandle)&&!handle.equals(thirdHandle)&&!handle.equals(secondHandle)) {
				fourHandle=handle;
				break;
			}
		}
		System.out.println(fourHandle);
		driver.switchTo().window(firstHandle);
		Thread.sleep(2000);
		driver.switchTo().window(secondHandle);
		Thread.sleep(2000);
		driver.switchTo().window(thirdHandle);
		Thread.sleep(2000);
		driver.switchTo().window(fourHandle);
		Thread.sleep(5000);
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		jsExecutor.executeScript("window.open('http://www.baidu.com')");
//		driver.quit();
	}

	
}
