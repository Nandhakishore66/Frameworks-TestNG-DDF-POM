package com.TestNG;

import org.testng.annotations.Test;

public class TestNGPart1 {
    // Part 1 - Introduction to testng, Installation and writing the 1st testcase

    /* What is testng?
    TestNg is a testing framework which is used to solve real time business requirements
    with his build in functions.

    In this testng we have not created any main method so how it will run?
       Usually, main method is the entry point of the program. but in this we have used @Test annotation at
       the top of every method so it will consider every method as 1 test case and it will give us some
       clear report in the terminal like how many passes, skips, failures like that.
     */
    @Test
    public void firstTestCase() {
        System.out.println("This is first testcase");
    }
    @Test
    public void secondTestCase() {
        System.out.println("This is second testcase");
    }
    @Test
    public void thirdTestCase() {
        System.out.println("This is third testcase");
    }
    @Test
    public void fourthTestCase() {
        System.out.println("This is fourth testcase");
    }
}
