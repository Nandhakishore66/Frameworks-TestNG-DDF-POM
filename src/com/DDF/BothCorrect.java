package com.DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.function.Function;

public class BothCorrect {
    /*
    1st video -- We have written 4 different classes for 4 different scenarios and then for running
    at one shot we have written the testng xml.
    2nd video -- Instead of putting all the classes under the same test tag we have used separate
    test tag for each of the classes becoz if we put all the clasess at the same test in test
    output report it will show like 1 test, inside the test 4 classes if we use separate test tag
    suppose if we have 4 classes it will show 4 tests. and also instead of giving username and
    password values directly inside the testcase we have given them in the xml inside the parameter
    tag and we have called them. so that if some other person also want to change their expired pass
    they can directly change in the xml itself they dont want to come inside the code..
    xml suite for video 2:
    <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
    <test verbose="2" name="BothCorrect">
        <parameter name="Username" value="Admin"></parameter>
        <parameter name="Password" value="admin123"></parameter>
    <classes>
        <class name="com.DDF.BothCorrect">
            <methods>
                <include name="loginWithBothCorrect"/>
            </methods>
        </class>
        </classes>
        </test>
    <test verbose="2" name="BothWrong">
        <parameter name="Username" value="Admin"></parameter>
        <parameter name="Password" value="admin12"></parameter>
        <classes>
        <class name="com.DDF.BothWrong">
            <methods>
                <include name="loginWithBothWrong"/>
            </methods>
        </class>
        </classes>
    </test>
    <test verbose="2" name="CorrectPassword">
        <parameter name="Username" value="Admi"></parameter>
        <parameter name="Password" value="admin123"></parameter>
        <classes>
        <class name="com.DDF.CorrectPassword">
            <methods>
                <include name="loginWithCorrectPassword"/>
            </methods>
        </class>
        </classes>
    </test>
    <test verbose="2" name="CorrectUsername">
        <parameter name="Username" value="Admin"></parameter>
        <parameter name="Password" value="admin12"></parameter>
        <classes>
        <class name="com.DDF.CorrectUsername">
            <methods>
                <include name="loginWithCorrectUsername"/>
            </methods>
        </class>
      </classes>
    </test>
</suite>
    3rd video - Now we are moving in to 3rd video? becoz still the number of lines has not reduced
    after using the parameter tag in the 2nd video. Actually we are doing same functionality and
    passing different datas right so only 1 class is enough to do that. So we need to delete all the
    classes(I have not deleted for future reference and created a new class for that) By using data
    provider drastically it will reduce more number of lines so instead of using paramater data provider
    is very useful for data driven framework. Line by line explanation is given in the (login class)
    (Important) = In data driven framework 100% the datas are passed in the excel sheet using csv
    files this the the correct implementation but we have passed the data inside the code from the
    next video we are going to see how to pass the datas using excel.
    4th video -In this video we are going to see how to read the data from the excel.

     */
    @Test
    @Parameters({"Username", "Password"})
    public void loginWithBothCorrect(String Uname, String Pword) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(7000);
        WebElement userName = driver.findElement(By.xpath("//input[@name = \"username\"]"));
        userName.sendKeys(Uname);
        WebElement password = driver.findElement(By.xpath("//input[@name = \"password\"]"));
        password.sendKeys(Pword);
        WebElement loginButton = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
        loginButton.click();
        driver.quit();

    }
}
