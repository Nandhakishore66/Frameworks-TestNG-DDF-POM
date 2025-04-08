package com.TestNG;

import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TransformerImpl extends Transformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        //super.transform(annotation, testClass, testConstructor, testMethod);
        annotation.setRetryAnalyzer(RerunFailedTestcases.class);
        /*
        Now under suite tag add listners tag inside that give this like below,
        class-name = com.testnG.TransformerImpl

       Inside class tag give the class name of which clss this transform want to listen
         */
    }
}
