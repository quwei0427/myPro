package com.selenium.elementOperate;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.DriverUtils1;
/*
 * 
 * 1)Thread.sleep(时间）  表示当前线程进入等待，死等
   2）隐式等待 （相当于全局的等待，常用页面加载，隐式等待会在webdriver对象实例的整个生命周期起作用，对多个元素起作用）
   3）显式等待 （对单个元素等待，等不到就一直等，直到超过规定时间）
 */
public class TestWaitOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "chrome");
		WebDriver driver = DriverUtils1.getDriver();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);// 隐式等待
		driver.get("http://localhost:5555/webtest/wait1.htm");
		// driver.findElement(By.id("sid3")).click();
		// driver.findElement(By.id("sid5")).click();
		// 显式等待第一种写法
		// WebElement element=new WebDriverWait(driver, 25).until(ExpectedConditions.presenceOfElementLocated(By.id("sid8")));
		// element.click();
		// 显式等待第2种写法
//		WebElement element = new WebDriverWait(driver, 25).until(new Function<WebDriver, WebElement>(){//Function匿名实现类
//			@Override
//			public WebElement apply(WebDriver t) {
//				// TODO Auto-generated method stub
//				return t.findElement(By.id("sid8"));
//			}
//		});
//		element.click();
		// 显式等待第3种写法
//		WebElement element = new WebDriverWait(driver, 25).until(new ExpectedCondition<WebElement>(){//ExpectedCondition实现匿名类
//			@Override
//			public WebElement apply(WebDriver input) {
//				// TODO Auto-generated method stub
//				return input.findElement(By.id("sid8"));
//			}
//		});
//		element.click();
		
		// 显式等待第4种写法 api上有这个例子
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)//最大等待时间
			       .pollingEvery(5, TimeUnit.SECONDS)//每次获取间隔
			       .ignoring(NoSuchElementException.class);//忽略异常信息

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {//Function实现匿名类
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("sid8"));
			     }
			   });
		element.click();
		// driver.findElement(By.id("sid8")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
//class MyFunction implements Function<WebDriver, WebElement>{
//	@Override
//	public WebElement apply(WebDriver t) {
//		// TODO Auto-generated method stub
//		return t.findElement(By.id("sid8"));
//	}
//}
