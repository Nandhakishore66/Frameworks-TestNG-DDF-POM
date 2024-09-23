package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Part1 {
    /*
    Part 1
    What is Page object model? Part 1
    1.Reusable  2.Organizable 3.understandable 4.managable 5.Scalable 6.Cost effective 7.Rules 8.Standard

    *In Applications, UI is not constant it always change their properties(ex: name=q, nxt time name=s) get
     upgrade. it will update the text box into auto complete text box, normal calendar into jquery
     calendar like that developers will do changes in the UI

    * So every time when they do changes the locators will get update, Lets consider there is button called
    accept and we have utilized that in more that 60 places in the main file, after a month if the button
    is changed to submit then it will be a problem becoz we need to change in all the 60 places, and also
    it is so hard to find where and all we used that locator. To avoid this we are going to use pom.

    * So in actual testcase we put only the functionality and seggragate the find elements part
     */

    /*Step1: Now I am going to use orange hrm Login Page
      Step2: As part of that we need to write the locators in separate page So I going to comment some of the lines
      once I put the locator in the separate file like driver.findElement(by.id("name") there is red squiggly
      line under driver becoz it will work by the use of webDriver driver = new chromeDriver() but in the locator
      page it is not there so we have to pass the driver in the paramater
      Step3 : For utilizing that locatorfile in this class create object for that class and call that
      method username(); --->Actually we are going to findElement for that username right, without using
      driver we are not able to find any of the Webelement in the web page. So pass the (driver) as parameter
      and in locatorfile username() method we need to add one parameter for receiving the driver and also we
      need to add the driver dataType(WebDriver). then if we try to utilize the property (.sendkeys) in the part1 file
      it will not work becoz we are not returning any of the element.
      Step4 : return the element from the locator file(explanation available in locators file.. now we are
      able to use the properties like sendkeys, click and all...
      Step 5 : Suppose if i dont want to create object for the locator class in this part 1 class, we can
      made the locators method as static then we can call that by without creating a object
     */
    @Test
    public void pom() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(7000);
        //Creating object for a other class into 1 class is not a good practice it will create a dependency
        /*LocatorsFile locatorsFile = new LocatorsFile();
        locatorsFile.username(driver).sendKeys("Admin");
        locatorsFile.password(driver).sendKeys("admin123");
        locatorsFile.submit(driver).click();*/
        LocatorsFile.username(driver).sendKeys("Admin");
        LocatorsFile.password(driver).sendKeys("admin123");
        LocatorsFile.submit(driver).click();



//        WebElement userName = driver.findElement(By.xpath("//input[@name = \"username\"]"));
//        userName.sendKeys("Admin");
//        WebElement password = driver.findElement(By.xpath("//input[@name = \"password\"]"));
//        password.sendKeys("admin123");
//        WebElement loginButton = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
//        loginButton.click();
//        driver.quit();
    }
}

