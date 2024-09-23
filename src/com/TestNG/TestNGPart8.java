package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPart8 {
    // Parameterization - We want give to some inputs from testng xml to code we need to use parameterization
    /*
    1. This process is like when we run the testcase in CTA by giving testrun id in metadata it get auto update
    in testrail right like that.
    under <test> tag we have to use <parameter> tag and the parameter contains name and value attributes
    <parameter name = "what" value = "pegion"> </parameter>
     */
    @Test
    @Parameters("what") // if both name attribute value and @parameter values are same it will pass value for value in sysout.
    public void val(String value) {
        System.out.println("value is" + value);
    }
}
