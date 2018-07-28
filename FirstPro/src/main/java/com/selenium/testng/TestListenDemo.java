package com.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListenDemo {
  @Test
  public void test1() {
	  System.out.println("test1");
  }
  @Test
  public void test2() {
	  System.out.println("test2");
	  Assert.fail("failed");
  }
}
