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

public class SecondTestng {
//	@Test(dataProvider = "dp")
//	  public void f(Integer n, String s) {
//		  System.out.println("@test2");
//	  }
	@Test
	public void test2() {
		System.out.println("@test2");
	}
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("@BeforeMethod2");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("@afterMethod2");
	  }


//	  @DataProvider
//	  public Object[][] dp() {
//	    return new Object[][] {
//	      new Object[] { 1, "a2" },
//	      new Object[] { 2, "b2" },
//	    };
//	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("@beforeClass2");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("@afterClass2");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("@beforeTest2");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("@afterTest2");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("@beforeSuite2");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("@afterSuite2");
	  }

}
