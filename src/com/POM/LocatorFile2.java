package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorFile2 {
    /*
    Step 2 (continues) : For finding webelements without using find elements use @FindBy annotation
    and pass the locators inside with attribute name and value.. and we can use anything like id,
    class, name, xpath and all..
     */
        @FindBy(xpath = "//input[@name = \"username\"]")
        public static WebElement username;
        @FindBy(xpath = "//input[@name = \"password\"]")
        public static WebElement password;
        @FindBy(xpath = "//button[@type = \"submit\"]")
        public static WebElement submit;
}
