package com.LAO;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screenshot {
    @Test(enabled = false)
    public void takesScreenshotExample() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("salem"+ Keys.ENTER);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\UC506533\\Downloads\\takes.png");
        FileHandler.copy(src, dest);
    }
   @Test
    public void robotScreenshot() throws AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("salem"+ Keys.ENTER);
        Robot robot = new Robot();
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(screensize);
        BufferedImage src = robot.createScreenCapture(rectangle);
        File dest = new File("C:\\Users\\UC506533\\Downloads\\robot.png");
        ImageIO.write(src, "png", dest);
    }


}
