package com.selenium.locatePos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utils.DriverUtils1;

public class TestLocateByCssSelectorExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils1.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
		driver.findElement(By.partialLinkText("检查情况")).click();
		for (int i = 0; i <= 5; i++) {
			driver.findElement(By.id("tianjia_buttoncdqk")).click();
		}
		
//	   、 driver.findElement(By.cssSelector("#ctqk tr:nth-of-type(3) td:nth-of-type(2) input:nth-of-type(2)")).click();
		List<WebElement> trs=driver.findElements(By.cssSelector("#ctqk tr"));
		for(int i=2;i<=trs.size();i++) {
			Thread.sleep(1000);
			if(i%2==0) {
			 driver.findElement(By.cssSelector("#ctqk tr:nth-of-type("+i+") td:nth-of-type(2) input:nth-of-type(2)")).click();
			}else {
				 driver.findElement(By.cssSelector("#ctqk tr:nth-of-type("+i+") td:nth-of-type(2) input:nth-of-type(1)")).click();
			}
		}
		Thread.sleep(5000);
		for(int i=trs.size();i>=2;i--) {
			Thread.sleep(1000);
			 driver.findElement(By.cssSelector("#ctqk tr:nth-of-type("+i+") td:nth-of-type(4) div")).click();
			
		}
		Thread.sleep(5000);
		
		driver.quit();
	}

}
