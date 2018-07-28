package com.selenium.screenShot;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.dataProvider.LoginDataProvider;
import com.selenium.pageObject.IndexPage;
import com.selenium.pageObject.LoginPage;
import com.utils.DriverUtils1;
import com.utils.TestBase;

public class TestLoginSceenShot extends TestBase {
	@Test
	public void test() throws InterruptedException {
		driver.get("http://localhost:5555/ecshop");
		IndexPage indexPage=new IndexPage(driver);
		indexPage.loginLink_click();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.input_username("zhangsan");
		loginPage.input_pwd("a12345678");
		loginPage.submit_click();
//        System.out.println(driver.getPageSource());
		loginPage.check_login_result("登录成功");
		Thread.sleep(3000);

	}
}
