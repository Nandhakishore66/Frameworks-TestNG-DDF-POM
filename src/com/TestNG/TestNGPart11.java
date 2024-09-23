package com.TestNG;

import org.testng.annotations.*;

public class TestNGPart11 {
    // Annotations
    /*
    Except test I have written all the remaining things in a correct order
     */
    @Test
    public void test() {
        System.out.println("I am test");
    }
    @Test
    public void test2() {
        System.out.println("I am test 2");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am Before suite");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("I am Before Test");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("I am Before Class");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am Before method");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("I am After Method");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("I am After class");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("I am After Test");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("I am After Suite");
    }
}
