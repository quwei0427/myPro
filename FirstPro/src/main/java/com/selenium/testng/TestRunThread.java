package com.selenium.testng;

import org.testng.annotations.Test;

public class TestRunThread {
  static int i=1;
  @Test(invocationCount=30,threadPoolSize=3)
  public void test() throws InterruptedException {
	  System.out.println("运行第"+i+"次!");
	  i++;
	  Thread.sleep(5000);
  }
}
