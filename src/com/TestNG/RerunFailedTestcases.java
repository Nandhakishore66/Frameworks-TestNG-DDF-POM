package com.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunFailedTestcases implements IRetryAnalyzer {

    public static void main(String[] args){
        /*
        Why we want to run failed testcases?
        Let's assume in a class we are having 5 methods, During the 1st trigger only 3 methods
        get passed and remaining 2 throwing some failure because of some time issues or some
        inconsistency. we rerun then it will pass, if that is the case we have to rerun the
        failed testcases.

        How to rerun the failed testcases?
        1. Using testNg-failed.xml
        2. Using IRetryAnalyzer(I) interface
        3. Using IAnnotationTransformer(I) and IRetryAnalyzerInterface(I)

        TestNG-failed.xml---> This particular file is available inside the test-output
        folder. Inside that it will have failed class name and also it will have the
        failed method name. But one concern is we have to trigger this manually. suppose
        if the scenario is like, we have to rerun the failed testcases for 5 times to
        check whether it is consistent means, we have to do this manually for all the times
        but it is hard to do right, so we have to move for another way,

        IRetryAnalyzer(I)---> Follow the below steps,
        1. create one class and implement the IRetryAnalyzer Interface.
        2. Add unimplemented method--> It will give one boolean method and also if the
        boolean method returns false, retry panna thevai ila apdinu indha method consider
        pannikum, if it returns true means it will consider like we need to retry.
        3. How this class knows whether my testcase get passed or failed?
        In the testcase method we have to add one attribute for @Test Annotation,
        @Test(retryAnalyzer= rerunfailedtestcases.class) what if I don't add this attribute?
        It will execute only once as usual.

        3. In separate class named Transformer

         */
    }

    int failedCount = 0;
    int limit = 4; // how many times we have to retry
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(failedCount<limit){
            failedCount++;
            return true;// if failed count increases, we have to retry, so we are using return true
        }
        return false;
    }
}
