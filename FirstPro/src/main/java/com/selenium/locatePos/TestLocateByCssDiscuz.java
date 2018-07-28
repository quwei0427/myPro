package com.selenium.locatePos;

import java.security.spec.MGF1ParameterSpec;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils1;

public class TestLocateByCssDiscuz {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "firefox");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://bbs.51testing.com/forum.php");
//    Thread.sleep(5000);
    driver.findElement(By.partialLinkText("软件测试新手上路")).click();
//    Thread.sleep(1000);
//      xpath定位
//    List<WebElement> list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]"));
//    list.get(0).findElement(By.xpath("tr/th/a[3]")).click();
//    driver.findElement(By.partialLinkText("软件测试新手上路")).click();
//    list=driver.findElements(By.xpath("//tbody[contains(@id,'normalthread')]"));
//    list.get(1).findElement(By.xpath("tr/th/a[3]")).click();
//      多个class类选择器的写法
//    System.out.println(driver.findElement(By.cssSelector(".btn-login.ml1.tb-bg.weight")).getText());
//     css定位
  List<WebElement> list=driver.findElements(By.cssSelector("tbody[id^='normalthread'] tr th>a:nth-of-type(3)"));
  list.get(0).click();
  driver.findElement(By.partialLinkText("软件测试新手上路")).click();
  list=driver.findElements(By.cssSelector("tbody[id^='normalthread'] tr th>a:nth-of-type(3)"));
  list.get(1).click();
    Thread.sleep(5000);
    driver.quit();
	}

}
