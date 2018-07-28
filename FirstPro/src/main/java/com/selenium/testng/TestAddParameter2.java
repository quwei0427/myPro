package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestAddParameter2 {
	Calculator calculator;
	//获取外部类的参数，一定要有测试数据的类属性dataProviderClass
	@Test(dataProvider = "shareData",dataProviderClass=TestAddDataProvider.class)
	public void testAdd(int num1,int num2,int expectedResult) {
		calculator.add(num1);
		calculator.add(num2);
		int result = calculator.getResult();
		Assert.assertEquals(result, expectedResult);//testng里的断言，用于判断预期结果与实际结果比较
	}

	@BeforeMethod
	public void beforeMethod() {
		calculator.clear();
	}

	@BeforeClass
	public void beforeClass() {
		calculator = new Calculator();
	}

	@AfterClass
	public void afterClass() {
		calculator = null;
	}

}
