package com.selenium.day01;

import java.io.File;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

public class BaiduFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:/driver/geckodriver.exe");
//		 System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, "C:/driver/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		// FirefoxOptions作为构造方法的参数
//		 FirefoxOptions firefoxOptions=new FirefoxOptions();// 设置firefox的执行路径，特别是当firefox安装时是自定义安装路径时		
//		 firefoxOptions.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		// firefoxOptions.setBinary(new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")));//也可以这样写
//		 WebDriver driver=new FirefoxDriver(firefoxOptions);
		// GeckoDriverService作为构造方法的参数
//		GeckoDriverService service = new GeckoDriverService.Builder()
//				.usingFirefoxBinary(
//						new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")))
//				.usingDriverExecutable(new File("C:/driver/geckodriver.exe")).usingAnyFreePort().build();
//		WebDriver driver = new FirefoxDriver(service);
		driver.get("http://www.baidu.com");
		driver.quit();
		driver=new FirefoxDriver();
		driver.get("http://www.51testing.com");
		driver.quit();
	}

}
