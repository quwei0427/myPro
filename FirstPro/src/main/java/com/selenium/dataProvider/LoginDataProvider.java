package com.selenium.dataProvider;

import org.testng.annotations.Test;

import com.utils.Config;

import org.eclipse.jetty.client.RequestNotifier;
import org.testng.annotations.DataProvider;

public class LoginDataProvider {
  Config config=new Config("config.properties");
  @DataProvider(name="loginData")
  public Object[][] data() {
//    return new Object[][] {
//      new Object[] { "zhangsan", "a12345678","登录成功"},
//      new Object[] { "lisi", "a12345678","用户名或密码错误"},
//    };
	  String excelName=config.getConfig("excelName");
	  return ReadExcel.readDataFromExcel(excelName, 0);
  }
}
