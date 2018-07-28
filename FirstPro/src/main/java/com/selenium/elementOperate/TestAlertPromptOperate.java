package com.selenium.elementOperate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils1;

public class TestAlertPromptOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "chrome");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
    Thread.sleep(1000);
    driver.findElement(By.partialLinkText("检查情况")).click();
    driver.findElement(By.cssSelector("select[name='vcZy1']+input")).click();
//    driver.findElement(By.xpath("//select[@name='vcZy1']/following-sibling::input[1]")).click();
    Alert alert=driver.switchTo().alert();
    alert.sendKeys("lisi");//prompt对话框中输入值
    Thread.sleep(2000);
//    System.out.println(alert.getText());
//    alert.dismiss();
    alert.accept();
    driver.findElement(By.xpath("//select[@name='vcZy1']/following-sibling::input[3]")).click();
    Thread.sleep(2000);
    alert=driver.switchTo().alert();
    alert.accept();
    
    Thread.sleep(5000);
    driver.quit();
	}

}
