package com.LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FetchGoogleSuggestions {
   @Test
    public void fetchGoogleSuggestionsExample() throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.co.in");
        Thread.sleep(4000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys("Champions of");
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role = \"listbox\"]/li"));
        for (WebElement ele : suggestions) {
            System.out.println(ele.getText());
        }

    }
}
