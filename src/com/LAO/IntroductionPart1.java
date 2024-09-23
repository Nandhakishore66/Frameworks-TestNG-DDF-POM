package com.LAO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionPart1 {//"C:\Users\UC506533\Downloads\chromedriver-win64\chromedriver-win64\chromedriver.exe"
    public static void main(String[] args) {
        //Test case 1. open chrome  2. Go for google home page

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//"C:\Users\UC506533\Downloads\chromedriver-new\chromedriver-win64\chromedriver.exe"
        driver.get("http://www.google.com");
        driver.close(); // used to close the browser

        // Part 2 is simply about instead of chrome driver used gecko driver(firefox)
    }
}
