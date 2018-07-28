package day3;

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

public class DriverUtils {
	public static DriverService service;
	public static String browser = null;
	static {// ��̬��
		browser = System.getProperty("browser.type", "firefox");// ��ȡ����������ͣ�Ĭ����firefox
		if ("firefox".equalsIgnoreCase(browser)) {// ���ݻ�ȡ ������������ͣ��ж� ʹ�ò�ͬ��service
			service = new GeckoDriverService.Builder()
					.usingFirefoxBinary(
							new FirefoxBinary(new File("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe")))
					.usingDriverExecutable(new File("C:/driver/geckodriver.exe")).usingAnyFreePort().build();
		} else if ("chrome".equalsIgnoreCase(browser)) {
			service = new ChromeDriverService.Builder().usingAnyFreePort()
					.usingDriverExecutable(new File("C:/driver/chromedriver.exe")).build();
		} else if ("ie".equalsIgnoreCase(browser)) {
			service = new InternetExplorerDriverService.Builder().usingAnyFreePort()
					.usingDriverExecutable(new File("C:/driver/IEDriverServer.exe")).build();
		} else {
			throw new RuntimeException("�������������");// �������������֮�����������;ͻᱨ��
		}

		try {
			service.start();// ��������
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 
	 * ��ȡWebDriver��̬����
	 */
	public static WebDriver getDriver() {
		WebDriver driver = null;
		if ("firefox".equalsIgnoreCase(browser)) {// �����������������ȡ WebDriver
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
	 * �رշ���
	 */
	public static void stopService() {
		service.stop();
	}

}
