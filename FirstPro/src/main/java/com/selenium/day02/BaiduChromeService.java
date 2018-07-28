package com.selenium.day02;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaiduChromeService {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		ChromeDriverService service = new ChromeDriverService.Builder().usingAnyFreePort()
				.usingDriverExecutable(new File("C:/driver/chromedriver.exe")).build();
		service.start();
//		ChromeOptions chromeOptions=new ChromeOptions();
//		chromeOptions.setBinary("C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
//		cWebDriver driver=new RemoteWebDriver(service.getUrl(),hromeOptions);
		WebDriver driver=new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
		driver.get("http://www.baidu.com");	
		Thread.sleep(1000);
		driver.quit();
//		driver=new RemoteWebDriver(service.getUrl(),
//		         DesiredCapabilities.firefox());
//		driver.get("http://www.51testing.com");
//		driver.quit();
		service.stop();
	}

}
