package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestcaseForRerunConcept {
    @Test(retryAnalyzer = RerunFailedTestcases.class)
    public void testcase1(){
        Assert.assertEquals(true, false);
    }
}
