package com.DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
    /*
    Step 1 : Create actual test case method
    step 2 : Create method for data provider and use data provider annotation, give name
    for that. In this method it should return the data.
    step 3 : Write the datas which am going to pass
    step 4 : Now I have to return the data so change the return type in data provider method
    Step 5 : Now I want to pass all the datas inside the testcase so I want to use data provider
    parameter to the @Test annotation
     */

    String[][] data = { // 2 dimensional array
        {"Admin", "admin123"},
        {"Admi", "admin12"},
        {"Admin", "admin12"},
        {"Admi", "admin123"}
    };

    //For passing all the datas in the same class am going to use data provider method
    @DataProvider(name = "loginDatas")
    public String[][] loginUsingDataProvider() {
        return data;
        //By using this am going to return the datas in the actual tetscase.
        // Now I am going write the data above
    }
    @Test(dataProvider = "loginDatas")
    // We need to give the same name which we have given in the above data provider method
    // It will run like loops like how many set of data we have given it will that much times.
    // We have given 4 set of datas it will run for 4 times...
    public void login(String Uname, String Pword) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(7000);
        WebElement userName = driver.findElement(By.xpath("//input[@name = \"username\"]"));
        userName.sendKeys(Uname);
        WebElement password = driver.findElement(By.xpath("//input[@name = \"password\"]"));
        password.sendKeys(Pword);
        WebElement loginButton = driver.findElement(By.xpath("//button[@type = \"submit\"]"));
        loginButton.click();
        //driver.quit();
    }
}
