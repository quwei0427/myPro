package com.selenium.elementOperate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils1;

public class TestAlertOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "chrome");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://localhost:5555/ecshop/admin");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    Alert alert=driver.switchTo().alert();
    System.out.println(alert.getText());
    Thread.sleep(2000);
    alert.accept();
    Thread.sleep(5000);
    driver.quit();
	}

}
