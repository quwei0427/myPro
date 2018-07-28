package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestng {
//  @Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
//	  System.out.println("@test1");
//  }
  @Test
  public void test1() {
	  System.out.println("@test1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod1");
  }

  @AfterMethod
  public void afterMethod() {

	  System.out.println("@afterMethod1");
  }


//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@beforeClass1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@afterClass1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@beforeTest1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@afterTest1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@beforeSuite1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@afterSuite1");
  }

}
