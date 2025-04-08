package com.LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Scrolling {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blockstream.info/block/000000000000000000076c036ff5119e5a5a74df77abf64203473364509f7732");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class = 'navbar-brand']")));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("window.scroll(0, 450)", "");//This will scroll to top upto 450
        //executor.executeScript("window.scroll(0, -450)", "");//This will scroll to down upto 450
        //executor.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");//This will scroll to bottom of the page
        //executor.executeScript("window.scrollTo(0, 0)", "");//This will scroll to top of the page
        WebElement sectionHeading = driver.findElement(By.xpath("//h3[@class = 'font-h3']"));
        executor.executeScript("argument[0].scrollIntoView(true);", sectionHeading);//This will do scroll down operation
        //executor.executeScript("argument[0].scrollIntoView(false);", sectionHeading);//This will do scroll up operation
    }
}
