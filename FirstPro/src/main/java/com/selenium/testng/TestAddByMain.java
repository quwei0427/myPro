package com.selenium.testng;

public class TestAddByMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试加法 测试用例数据 1+2
		Calculator calculator=new Calculator();
		calculator.clear();//清零
		calculator.add(1);
		calculator.add(2);
		int result=calculator.getResult();
		if(result==3) {
			System.out.println("pass!");
		}else {
			System.out.println("fail!");
		}
		
	}

}
