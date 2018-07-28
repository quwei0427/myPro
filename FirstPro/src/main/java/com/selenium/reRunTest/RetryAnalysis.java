package com.selenium.reRunTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalysis implements IRetryAnalyzer {
	private int count=0;
	private static final int MAX=1;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<MAX) {
			count++;
			return true;
		}			
		return false;
	}

}
