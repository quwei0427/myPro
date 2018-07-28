package com.selenium.locatePos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utils.DriverUtils1;

public class TestLocateByDOMExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils1.getDriver();
		driver.get("http://www.taobao.com");
		Thread.sleep(1000);
		scollFullPage(driver);
		WebElement element=driver.findElement(By.cssSelector("div.afford-inner>h3>em"));
		Thread.sleep(3000);
		sollToElement(driver,element);
		Thread.sleep(5000);
		driver.quit();
	}
	public static void scollFullPage(WebDriver driver) throws InterruptedException {
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		long totalHeight=(long)jsExecutor.executeScript("return(document.body.scrollHeight)");
		int height=driver.manage().window().getSize().getHeight();
		for(int i=1;i<=totalHeight/height;i++) {			
			jsExecutor.executeScript("window.scrollTo(arguments[0],arguments[1])",0,i*height);
			Thread.sleep(2000);
		}	
	}
	public static void sollToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		jsExecutor.executeScript("window.scrollTo(arguments[0],arguments[1])",element.getLocation().x,element.getLocation().y-100);
	}

}
