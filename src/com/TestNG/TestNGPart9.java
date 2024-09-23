package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPart9 {
    // Parallel testing
    /*
    1. In TestNGPart4 1 test case is depends on another so at that we cannot use this parallel testing.
    2. Lets consider a testcase we want to open chrome and bing in this one will not affect another right
       so we can run those test case parallel at a time so we can use a parallel testing.
    3. For running both the testcases parallely inside the suite tag we have to add 2 attributes
       parallel(Which we want to run parallely), thread-count(How many chrome process we want to open).
    <suite name = "TestSuite" parallel = "methods" thread-count = "2">
     */
    @Test
    public void google(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }
    @Test
    public void bing(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.bing.com");
    }

    // Part 10 -- Is about assertions so refer hand written notes...
}
