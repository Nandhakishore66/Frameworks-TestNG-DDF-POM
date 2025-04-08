package com.LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandlingUsingId {
    public static void main(String[] args){
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String oldWindow = driver.getWindowHandle();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='newWindowBtn']")));
        element.click();
        Set<String> allWindowsSet = driver.getWindowHandles();
        List<String> allWindows = new ArrayList<>(allWindowsSet);
        driver.switchTo().window(allWindows.get(1));
        WebElement heading = driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
        String txt = heading.getText();
        System.out.println(txt);

    }
}
