package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsFile {
    /*Step4: Every locator is a webelement so, void does not return anything if i want to return
    that weblement instead of void type as webelement and use return keyword.
     */
    public static WebElement username(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@name = \"username\"]"));
        /*Step 3 :Adding parameter to recieve the driver complete explanation in(Part1 file)
        */
    }
    public static WebElement password(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@name = \"password\"]"));
    }
    public static WebElement submit(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@type = \"submit\"]"));
    }
}
