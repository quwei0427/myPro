package com.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunOrder {
  @Test(priority=3)
  public void test1() {
	  System.out.println("test1");
  }
  @Test(priority=0)
  public void test5() {
	 
	  System.out.println("test5");
//	  Assert.fail();
  }
  @Test(priority=2)
  public void test3() {
	  System.out.println("test3");
  }
  @Test(priority=1)
  public void test2() {
	  System.out.println("test2");
  }
}
