package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton {


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
    public void testAlertButton() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("Radha");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }
    @Test
    public void testConfirmButton() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("Parin");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(4000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);

    }


    @After
    public void tearDown(){

        driver.close();
    }
}
