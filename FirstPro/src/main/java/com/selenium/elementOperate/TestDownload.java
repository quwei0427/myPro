package com.selenium.elementOperate;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


public class TestDownload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = "c:\\kk";
		String downloadFilePath = path + "\\Adobe Reader XI PDF阅读器@1063_3116.exe";
		File file = new File(downloadFilePath);
		if (file.exists()) {
			file.delete();
		}
		System.setProperty("webdriver.gecko.driver", "C:/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(firefoxDriverOptions());

		Thread.sleep(2000);
		driver.get("http://soft.sysdaa.com/10/3116.html?tab=1063");
		driver.findElement(By.cssSelector(".newdown1")).click();
		if (file.exists()) {
			System.out.println("ok!");
		} else {
			System.out.println("no this file!");
		}
	}

	public static FirefoxOptions firefoxDriverOptions() throws Exception {
		FirefoxOptions options = new FirefoxOptions();
		// 声明一个 profile 对象
		FirefoxProfile profile = new FirefoxProfile();
		// 设置 Firefox 的browser.download.folderList属性为 2
		// 如果没有进行显示设定，则使用默认值 1，表示下载文件保存在“下载”文件夹
		// 设定为 0，则下载文件会被保存在用户的桌面上
		// 设定为 2，则下载文件会被保存在指定的文件夹下
		profile.setPreference("browser.download.folderList", 2);
		// browser.download.manager.showWhenStarting的属性默认值为 true
		// 设定为 true，则在用户启动下载的时候显示 Firefox 浏览器的文件下载窗口
		// 设定为 false，则在用户启动下载的时候不显示 Firefox 浏览器的文件下载窗口
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		Thread.sleep(5000);
		// browser.download.dir设定下载文件保存的目录
		profile.setPreference("browser.download.dir", "c:\\kk");
		// browser.helperApps.neverAsk.openFile表示直接打开下载文件，不显示确认框
		// 默认值为空字符串，下行代码行设定了多种文件的 MIME类型，例如，application/x-msdownload
		// 表示.exe类型的文件，application/excel表示 Excel 类型的文件
		profile.setPreference("browser.helperApps.neverAsk.openFile",
				"application/octet-stream,application/exe,text/csv, application/pdf, application/x-msexcel,application/excel,application/x-excel, application/excel,application/x-excel,application/excel,application/vnd.ms-excel,application/x-excel,application/x-msexcel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml,application/excel,application/x-msdownload");
		// browser.helperApps.neverAsk.saveToDisk表示下载文件是否直接保存到磁盘
		// 默认值为空字符串，下行代码行设定了多种文件的 MIME类型，例如，application/x-msdownload
		// 表示.exe类型的文件，application/excel表示 Excel 类型的文件
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
				"application/octet-stream,application/exe,text/csv,application/pdf,application/x-msexcel,application/excel,application/x-excel, application/excel,application/x-excel,application/excel, application/vnd.ms- excel,application/x-excel,application/x-msexcel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml,application/excel,text/x-c,application/x-msdownload");
		// browser.helperApps.alwaysAsk.force对于未知的 MIME 类型文件会弹出窗口
		// 让用户处理，默认值为true，设定为false表示不会记录打开未知 MIME 类型
		// 文件的方式
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		// 下载.exe文件弹出警告，默认值是 true，设定为false 则不会弹出警告框
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		// browser.download.manager.focusWhenStarting设定下载框在下载时会获取焦点
		// 默认值为 true，设定为 false 表示不获取焦点
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		// browser.download.manager.useWindow设定下载是否显示下载框，默认值为true
		// 设定为 false 会把下载框进行隐藏
		profile.setPreference("browser.download.manager.useWindow", false);
		// browser.download.manager.showAlertOnComplete设定下载文件结束后是否显示下载
		// 完成提示框，默认值为 true，设定为 false 表示下载完成后不显示下载完成提示框
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		// browser.download.manager.closeWhenDone设定下载结束后是否自动关闭下载框
		// 默认值为true，设定为false 表示不关闭下载管理器
		profile.setPreference("browser.download.manager.closeWhenDone", false);

		options.setProfile(profile);
		return options;
	}

}
