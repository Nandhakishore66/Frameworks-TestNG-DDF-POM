package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertAmazon {
	@Test
	public void method() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\NAVEEN\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		Thread.sleep(3000);
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Crocs"+Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement find=driver.findElement(By.xpath("//*[@id=\"n-title\"]/span"));
		String expect=find.getText();
		
		Assert.assertEquals("Department", expect);
		
	}

}
