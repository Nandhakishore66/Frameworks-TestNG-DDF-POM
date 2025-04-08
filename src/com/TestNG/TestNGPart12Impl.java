package com.TestNG;

import org.testng.ITestResult;

public class TestNGPart12Impl extends TestNGPart12 {
//As we are going to override the functionality for the methods, it is having override at the top.

    //one more point..
    /*
    Here I have added only print statement for understanding purpose but in realtime it will be
    like, Suppose if the testcase failed suddenly it will go for onTestFailure listener, then
    if we have written some screenshot functionality then it will be very useful right, like that
    we can design a very good framework....
     */
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test going to execute");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test succeed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test percentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test failed because of timeout");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test going to start");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test going to finish");
    }
}
