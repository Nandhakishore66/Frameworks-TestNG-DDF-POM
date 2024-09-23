package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Part2 {
    /*
    Objective of part 2 -- Enhancing our pom project with selenium page factory
    * In selenium, For implementing pom there is a class called pageFactory we are gng to see in this
      part 2.
    * For that I am going to utilize the code from part 1 and for upgrading the locator file, am gng
      to create a new file because, it will be useful in future to see the step by step executions
    */

    /*Steps
    1. Write a code for orange hrm login.
    2. Upgrading locators by reffering LocatorsFile part 1,
    Interview question: How to find the elements without using find elements? ans in LocatorFile 2
    3. As we have written the locators as static we can call it by without creating a object. call
    and utilize the properties.
    4. Then if we trigger it will throw Null pointer exception becoz we have used @FindBy annotation
    but it will not find the webElements without using WebDriver object name. So here as we used
    @FindBy annotation we are going to use pageFactory class
    5


     */
    @Test
    public void orangeHrmLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(7000);
        /*
        Once it came to the pageFactory line as we mentioned driver for that class 1st it will find
        all the locators in that file in a single attempt and then it will came to the next line and
        it will do the executions faster..
         */
        PageFactory.initElements(driver, LocatorFile2.class);
        LocatorFile2.username.sendKeys("Admin");
        LocatorFile2.password.sendKeys("admin123");
        LocatorFile2.submit.click();
    }

}
