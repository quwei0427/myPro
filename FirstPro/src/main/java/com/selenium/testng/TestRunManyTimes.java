package com.selenium.testng;

import org.testng.annotations.Test;

public class TestRunManyTimes {
  static int i=1;
  @Test(invocationCount=5)
  public void test() {
	  System.out.println("运行第"+i+"次!");
	  i++;
  }
}
