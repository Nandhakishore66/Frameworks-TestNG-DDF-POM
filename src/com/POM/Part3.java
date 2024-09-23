package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Part3 {
    // Part 3 - How to find the elements without using driver.findElements and @FindBy annotations?

    /*
    Step1: Write the basic lines
    Step2: write the locators and give variable name as, locators id value or name value directly
    and made it as static becoz if we are using page factory we need to put it as static
    Step3: We can write what we are going to do like sendkeys or click function like that and if we trying
    to run it will throw null pointer exception becoz we have not utilized driver and page factory.
    Step 4 : Write a line for page factory, while running when it came to that line it will 1st check
    whether the variable name and locator id value is equal or not if it is not equal then it will check
    with name value. and this type of execution is only applicable for id and name..

    How to find the Webelements without using driver.findElements and @FindBy annotations?
    For that, that particular element it should must have id or name if it has then we can directly take that
    attribute value and give it as webelement variable name. and we should use pagefactory.initElements
     */
    public static WebElement username;
    public static WebElement password;
    @Test
    public void example() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(7000);
        PageFactory.initElements(driver, Part3.class);
        username.sendKeys("Admin");
        password.sendKeys("admin123");

    }

}
