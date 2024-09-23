package com.TestNG;

import org.testng.annotations.Test;

public class TestNGPart3 {
    // Part 3 : Skip a test case.

    /* Now if we dont want to stop the car we can use one attribute enabled = false.
    For other test case by default it has the value of enabled = true.
     */
    @Test(priority = 1)
    public void startTheCar() {
        System.out.println("start The Car");
    }
    @Test(priority = 2)
    public void putFirstGear() {
        System.out.println("put First Gear");
    }
    @Test(priority = 3)
    public void putSecondGear() {
        System.out.println("put second Gear");
    }
    @Test(priority = 4)
    public void putThirdGear() {
        System.out.println("put third Gear");
    }
    @Test(priority = 5, enabled = false)
    public void stopTheCar() {
        System.out.println("stop The Car");
    }
}
