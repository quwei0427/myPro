package com.selenium.elementOperate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utils.DriverUtils1;

public class TestKeyboardOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "chrome");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://localhost:5555/ecshop/admin");
    Thread.sleep(1000);
    driver.findElement(By.name("username")).sendKeys("administrator");
    driver.findElement(By.name("password")).sendKeys("a12345678");
    Thread.sleep(1000);
    //第一种方式，常用的
//    Actions actions=new Actions(driver);
//    actions.sendKeys(Keys.ENTER).perform();//键盘回车操作 perform()方法必须要写
  //第二种方式，确定点击哪个元素
    driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
    Thread.sleep(2000);

    Thread.sleep(5000);
    driver.quit();
	}

}
