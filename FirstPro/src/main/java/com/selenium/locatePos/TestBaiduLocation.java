package com.selenium.locatePos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils1;

public class TestBaiduLocation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "firefox");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
//    driver.findElement(By.id("kw")).sendKeys("selenium");
    //单个 name元素用findElement
    //多个 name元素用findElements返回 的结果 的List<WebElement>
    List<WebElement> radios=driver.findElements(By.name("vcFf"));
    radios.get(1).click();
//    for(WebElement el:radios) {
//    	el.click();
//    	Thread.sleep(2000);
//    }
    for(int i=0;i<radios.size();i++) {
//    	System.out.println("第"+(i+1)+"个:"+radios.get(i).isSelected());
    	WebElement element=radios.get(i);
    	if(element.isSelected()) {
    		System.out.println(element.getAttribute("value"));
    	}
    	Thread.sleep(2000);
    }
    
	Thread.sleep(2000);
    driver.quit();
	}

}
