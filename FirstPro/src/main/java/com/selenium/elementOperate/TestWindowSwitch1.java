package com.selenium.elementOperate;

import java.util.List;
import java.util.Set;

import org.apache.xml.serializer.utils.StringToIntTable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils1;

public class TestWindowSwitch1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils1.getDriver();
		driver.get("http://bbs.51testing.com/forum.php");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		Thread.sleep(2000);
		String firstHandle = driver.getWindowHandle();
		Set<String> firstWindowsSet = driver.getWindowHandles();
		// List<WebElement>
		// list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		// list.get(0).click();
		List<WebElement> list = driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]"));
		list.get(0).findElement(By.xpath("tr/th/a[3]")).click();//这种写法也可以的
		Thread.sleep(3000);
		Set<String> secondWindowSet = driver.getWindowHandles();
		String secondHandle = getCurrentHandle(secondWindowSet, firstWindowsSet);
		driver.switchTo().window(firstHandle);
		// driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		Thread.sleep(3000);

		// 以下这一步必须要有，需要重新更新获取一下元素List才可以，因为上面已经动过了，否则获取不到
		list = driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(1).click();
		Thread.sleep(3000);
		Set<String> thirdWindowSet = driver.getWindowHandles();
		String thirdHandle = getCurrentHandle(thirdWindowSet, secondWindowSet);
		System.out.println(firstHandle);
		System.out.println(secondHandle);
		System.out.println(thirdHandle);

		driver.switchTo().window(firstHandle);
		// driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		list = driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]/tr/th/a[3]"));
		list.get(2).click();
		Thread.sleep(2000);
		Set<String> fourWindowSet = driver.getWindowHandles();
		String fourHandle = getCurrentHandle(fourWindowSet, thirdWindowSet);
		System.out.println(fourHandle);
		driver.switchTo().window(firstHandle);
		Thread.sleep(3000);
		driver.switchTo().window(secondHandle);
		Thread.sleep(3000);
		driver.switchTo().window(thirdHandle);
		Thread.sleep(3000);
		driver.switchTo().window(fourHandle);
		Thread.sleep(5000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.open('http://www.baidu.com')");
		// driver.quit();
	}

	public static String getCurrentHandle(Set<String> windowHandles, Set<String> beforeWindowHandles) {
		String currentHandle = "";
		for (String windowHandle : windowHandles) {
			boolean bool = true;//默认设置为true
			for (String beforeWindowHandle : beforeWindowHandles) {
				if (beforeWindowHandle.equals(windowHandle)) {
					bool = false;//前面窗口sid里是有的
					break;
				}
			}
			if (bool == true) {
				currentHandle = windowHandle;
				break;
			}
		}
		return currentHandle;
	}

}
