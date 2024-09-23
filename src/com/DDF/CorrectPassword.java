package com.DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectPassword {
    @Test
    @Parameters({"Username", "Password"})
    public void loginWithCorrectPassword(String Uname, String Pword) throws InterruptedException {
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
