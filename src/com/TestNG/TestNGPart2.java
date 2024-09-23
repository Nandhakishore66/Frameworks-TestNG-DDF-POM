package com.TestNG;

import org.testng.annotations.Test;

public class TestNGPart2 {
    // Part 2 : How to set priority to testcases? which means order of execution

    /* Testcase :
    1. Start the car 2. put 1st Gear 2. Put 2nd Gear 3. Put 3rd Gear 4. Reach 80km speed
   */

    /*
    1. If we normally run without giving keyword(priority) it will run the method according to the
    methods alphabetical order so that we have to use the priority.
    2. priority is attribute for @Test annotation and we can assign only integer value for this one.
    3. If we did not give priority for 1 method and if we give for remaining all methods 1st it will
       print the priority not given one.
    4.  If we any minus values(-) it will print 1st the minus values one.
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
    @Test(priority = 5)
    public void stopTheCar() {
        System.out.println("stop The Car");
    }
}
