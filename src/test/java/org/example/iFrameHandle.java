package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class iFrameHandle {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test

    public void iFramePractice() throws InterruptedException {
//        WebElement iFrame = driver.findElement(By.id("courses-iframe"));
        Thread.sleep(4000);
//        driver.switchTo().frame(iFrame);
        driver.switchTo().frame(0);
        Thread.sleep(4000);
        WebElement searchTab = driver.findElement(By.xpath("//input[@id='search']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchTab);
        Thread.sleep(3000);
        searchTab.sendKeys("Python");
        searchTab.sendKeys(Keys.ENTER);
        Thread.sleep(4000);

        driver.switchTo().defaultContent();
        WebElement benzRadio = driver.findElement(By.id("benzRadio"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", benzRadio);
        Thread.sleep(3000);
        benzRadio.click();
        Thread.sleep(3000);

    }

    @After
    public void tearDown(){

        driver.close();
    }
}
