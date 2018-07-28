package com.selenium.day02;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaiduIeService {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InternetExplorerDriverService service = new InternetExplorerDriverService.Builder().usingAnyFreePort()
				.usingDriverExecutable(new File("C:/driver/IEDriverServer.exe")).build();
		service.start();		
		WebDriver driver=new RemoteWebDriver(service.getUrl(),
		         DesiredCapabilities.internetExplorer());
		driver.get("http://www.baidu.com");		
		driver.quit();
//		driver=new RemoteWebDriver(service.getUrl(),
//		         DesiredCapabilities.firefox());
//		driver.get("http://www.51testing.com");
//		driver.quit();
		service.stop();
	}

}
