package com.LAO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleSuggestionPositionClick {
    @Test
    public void googleSuggestionPositionClick() throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.co.in");
        Thread.sleep(4000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys("Champions of");
        Thread.sleep(3000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role = \"listbox\"]/li"));
        int position = 0;
        for (WebElement ele : suggestions) {
            System.out.println(ele.getText());
            position++;
            if (position == 4) {
                ele.click();
                break; // if we not used break, for loop will again continue it will throw stale ele excep..
            }
        }


    }

    public void googleSuggestionsText() throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\UC506533\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.co.in");
        Thread.sleep(4000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys("Champions of");
        Thread.sleep(3000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role = \"listbox\"]/li"));
        for (WebElement ele : suggestions) {
            if (ele.getText().equals("Champions of 2024")){
                ele.click();
                break;
            }
        }


    }
}
