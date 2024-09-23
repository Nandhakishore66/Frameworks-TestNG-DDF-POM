package com.TestNG;

import org.testng.annotations.Test;

public class TestNGPart4 {
    // Part 4 : How to handle dependencies ? Dependencies : One depends on another
    /*
    Ex : I am working on Amazon project, I am going to check add to cart functionality is working fine
    before that 1st I should verify am able to login in amazon. If I am not able to logging in amazon website
    how should i check whether add to cart functionality is working fine or not. So that we are using this
    dependencies concept.
    Test case : 1. You have to admit a student in higher secondary and you have to admit a student in engineering
    For this, there is a condition if a student completes high school then only he is eligible for Higher secondary
    and If the students completes higher secondary then only he is eligible for engineering. So in this place
    Attribute(Priority) will not work. becoz one thing is depends on another we have to use (depends on methods).
     */
    @Test
    public void highSchool() {
        System.out.println("Eligible for high school");
    }
    @Test(dependsOnMethods = "highSchool")
    public void higherSecondarySchool() {
        System.out.println("Eligible for higher secondary");
    }
    @Test(dependsOnMethods = "higherSecondarySchool")
    public void engineering() {
        System.out.println("Eligible for engineering");
    }
}
