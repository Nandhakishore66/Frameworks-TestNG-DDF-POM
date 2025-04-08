package com.LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        //Finding the web elements and interacting with them
        /*Test case
        1. open chrome
        2. Go for google home page
        3. Enter a search term in search bar (ex: trichy)
        4. Open wikepedia link*/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("salem"+Keys.ENTER);
        // Upto 20th line part 3 video is completed now part 4

        //driver.findElement(By.linkText("Salem, Tamil Nadu")).click();
        driver.findElement(By.linkText("Salem metropolitan area (India)")).click();
        /*If we use link it will be available in the anchor tag
        link text : we need to give full text available in the (anchor tag)
        Partial   : link text we can give Partial text available in the (anchor tag)
         */

    }
}
