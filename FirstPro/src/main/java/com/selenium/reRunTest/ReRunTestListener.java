package com.selenium.reRunTest;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunTestListener implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		//获取重跑分析器对象，判断是否为空，如果为空，则设置重跑分析器，不为空，则不设置
		IRetryAnalyzer iRetry = method.getTestMethod().getRetryAnalyzer();
		if (iRetry == null) {
			method.getTestMethod().setRetryAnalyzer(new RetryAnalysis());
		}
	}

}
