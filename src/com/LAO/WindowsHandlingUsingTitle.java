package com.LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WindowsHandlingUsingTitle {

    public static void main(String[] args) {

        /* For URL just 2 change 1. instead of expected title give expected URL and in
        if condition instead of driver.getTitle give driver.getCurrentUrl()
         */
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String oldWindow = driver.getWindowHandle();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='newWindowBtn']")));
        element.click();
        Set<String> allWindowsSet = driver.getWindowHandles();
        String expectedTitle= "H Y R Tutorials";
        for(String allWindow: allWindowsSet){
            driver.switchTo().window(allWindow);
            if(driver.getTitle().equals(expectedTitle)){
                System.out.println("Switched to new window");
                break;
            }
        }
        driver.close();
    }
}
