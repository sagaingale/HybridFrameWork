package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;

import com.base.BaseClass;

public class MyListener extends BaseClass implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		
		log.info("*****Test is Started*****"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		log.info(Status.PASS + "*****Test is Started*****"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		
		log.info(Status.FAIL + " *****Test is Failed***** "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		
		log.info(Status.SKIP + " *****Test is Skipped***** "+result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		log.info("Test suite is ready for the execution  "+context.getName());

	}

	public void onFinish(ITestContext context) {
		
		
	}

	

}
