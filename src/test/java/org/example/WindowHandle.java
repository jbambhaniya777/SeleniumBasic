package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {



    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
public void switchToWindow() throws InterruptedException {
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);
        driver.findElement(By.id("openwindow")).click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);
        for (String handle:allWindowHandles) {
            if (!handle.equals(parentWindowHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(4000);
                WebElement searchTab = driver.findElement(By.xpath("//input[@id='search']"));
                searchTab.sendKeys("Python");
                searchTab.sendKeys(Keys.ENTER);
                Thread.sleep(4000);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowHandle);
        WebElement benzRadio = driver.findElement(By.id("benzRadio"));

        benzRadio.click();
        Thread.sleep(3000);

    }

    @After
    public void tearDown(){

        driver.close();
    }
}
