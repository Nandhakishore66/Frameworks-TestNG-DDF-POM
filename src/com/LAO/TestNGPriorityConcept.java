package com.LAO;

import org.testng.annotations.Test;

public class TestNGPriorityConcept {

    @Test(priority = -1)
    public void firstTestCase(){
        System.out.println("This is first testcase");
    }
    @Test(priority = 2)
    public void secondTestCase(){
        System.out.println("This is second testcase");
    }
    @Test(priority = 3)
    public void thirdTestCase(){
        System.out.println("This is third testcase");
    }
    @Test
    public void fourthTestCase(){
        System.out.println("This is fourth testcase");
    }
}
