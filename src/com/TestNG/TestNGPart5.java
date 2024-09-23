package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGPart5 {
    //Part 5 : How to write test suite using testng
    /*
    Test case : 1. Open google chrome 2. Go to google home page 3. Go to bing home page 4. Go to yahoo home page

     */
    WebDriver driver; // We mentioned this as an class level variable becoz if we put this as method level it will work upto that block
    long startTime;
    @BeforeSuite /* 1. Suite = collection of testcases. if we use @Test in any method then it will consider
    that as 1 testcase 2. It will happen before all the testcases gets executed.*/
    public void openBrowser() {
        startTime = System.currentTimeMillis(); // Which is used to check the current time
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test // We can convert this method as testcase by using @Test annotation
    public void google(){
        driver.get("http://www.google.com");
    }
    @Test
    public void bing(){
        driver.get("http://www.bing.com");
    }
    @Test
    public void yahoo(){
        driver.get("http://www.yahoo.com");
    }
    @AfterSuite//It will happen after all the testcases gets executed
    public void closeBrowser() {
        driver.quit();
        long endTime = System.currentTimeMillis(); // Which is used to check the current time
        long totalTime = endTime-startTime; // if we subtract end time - start we can get the actual time
        System.out.println("Total time taken:" + totalTime);
    }
    /*
    Instead of launch every time by using testng we had written only the actual step inside the
    method. remaining and all we put it in the before and after suite.
     */
    // Part 6 : Write a test suite in xml file. below is the description
    /*
    1. We have more test suites which means more class file like TestNGPart1, TestNGPart2 like that
    2. If we want to run Individually it will take more time. our need is we want to run in one shot.
       So we are creating a suite. inside the suite we will put all the tests(Classes).
    3. For that we need to create a xml file. File ---> Settings--->plug ins---->Type testng in search box
    ----> Install and apply and ok -----> Right click on project name atlast there is a option create xml file.
    4. <Suite> ----> Which contains all the test cases so next will be <test> inside the test we have <classes>
       after that we have to mention each and every <class> In class we have to add the attribute which is name and
       the attribute value we have to give packagename.class name = fully qualified class name.
    5. The order of execution is according to which class we have mentioned 1st in the xml will execute 1st.
    6. Once we are done with the execution we need to take the report so we need to edit the configurations by
       clicking on current file dropdown near run button. and click testng inside that click on listners and click
       the check box use default reports and click apply and ok
    7. And there is new folder named test output inside that there are list of reports out of that 2 important
       reports named index.html and email reports
    7. If we add an attribute verbose = 2(level of information) it will give some indepth details like how much
       time that every method will take to complete the execution
     */

}
