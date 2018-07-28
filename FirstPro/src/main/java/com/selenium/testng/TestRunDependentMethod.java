package com.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunDependentMethod {
  @Test(dependsOnMethods="register")
  public void login() {
	  System.out.println("login");
  }
  @Test
  public void openBrowser() {
	  System.out.println("openBrowser");
	  Assert.fail();
  }
  @Test(dependsOnMethods="openBrowser")
  public void register() {
	  System.out.println("register");
  }
  @Test(dependsOnMethods="login")
  public void exit() {
	  System.out.println("exit");
  }
}
