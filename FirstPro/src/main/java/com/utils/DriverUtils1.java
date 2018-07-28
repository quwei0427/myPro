package com.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

public class DriverUtils1 {
	public static DriverService service;
	public static String browser = null;
	static {// 静态块
		browser = System.getProperty("browser.type", "firefox");// 获取浏览器的类型，默认是firefox
		if ("firefox".equalsIgnoreCase(browser)) {// 根据获取 到的浏览器类型，判断 使用不同的service
			service = new GeckoDriverService.Builder()
					.usingFirefoxBinary(
							new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe")))
					.usingDriverExecutable(new File("C:/driver/geckodriver.exe")).usingAnyFreePort().build();
		} else if ("chrome".equalsIgnoreCase(browser)) {
			service = new ChromeDriverService.Builder().usingAnyFreePort()
					.usingDriverExecutable(new File("C:/driver/chromedriver.exe")).build();
		} else if ("ie".equalsIgnoreCase(browser)) {
			service = new InternetExplorerDriverService.Builder().usingAnyFreePort()
					.usingDriverExecutable(new File("C:/driver/IEDriverServer.exe")).build();
		} else {
			throw new RuntimeException("设置浏览器有误！");// 如果是三种类型之外的浏览器类型就会报错
		}

		try {
			service.start();// 启动服务
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 
	 * 获取WebDriver静态方法
	 */
	public static WebDriver getDriver() {
		WebDriver driver = null;
		if ("firefox".equalsIgnoreCase(browser)) {// 根据浏览器类型来获取 WebDriver
			driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.firefox());
		} else if ("chrome".equalsIgnoreCase(browser)) {
			driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
		} else {
			driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.internetExplorer());
		}
		return driver;

	}

	/*
	 * 
	 * 关闭服务
	 */
	public static void stopService() {
		service.stop();
	}

}
