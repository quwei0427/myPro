package com.selenium.elementOperate;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.DriverUtils1;

public class TestSelectOperate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils1.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
		Thread.sleep(1000);
/*		Select select=new Select(driver.findElement(By.name("vcZy")));
		select.selectByVisibleText("学生");//通过显示的文本选中
		Thread.sleep(2000);
		select.selectByIndex(4);//index从0开始数
		Thread.sleep(2000);
		select.selectByValue("10");//value属性值来选中
		//如何判断哪个被选中
		for(int i=0;i<select.getOptions().size();i++) {
			if(select.getOptions().get(i).getAttribute("selected")!=null) {
				System.out.println(select.getOptions().get(i).getText());//打印显示的文本
				System.out.println(select.getOptions().get(i).getAttribute("value"));//打印value属性值
				break;
			}
		}
		Thread.sleep(1000);
		select.selectByIndex(0);//单选取消选中就选第一个
		
		for(int i=0;i<select.getOptions().size();i++) {
			Thread.sleep(500);
			select.selectByIndex(i);
		}*/
		driver.findElement(By.partialLinkText("检查情况")).click();
		Select select1=new Select(driver.findElement(By.name("vcZy1")));
		select1.selectByVisibleText("学生");//通过显示的文本选中
		select1.selectByIndex(4);//index从0开始数
		select1.selectByValue("05");//value属性值来选中
		System.out.println(select1.getFirstSelectedOption().getText());//只能应用 于多选下拉式列表框
		select1.deselectByIndex(4);//只能应用 于多选下拉式列表框
		// 多选获取value和选中的值
		for(int i=0;i<select1.getOptions().size();i++) {
			if(select1.getOptions().get(i).getAttribute("selected")!=null) {
				System.out.println(select1.getOptions().get(i).getText());//打印显示的文本
				System.out.println(select1.getOptions().get(i).getAttribute("value"));//打印value属性值
			}
		}
		select1.deselectAll();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
