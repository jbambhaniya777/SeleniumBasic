package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
// SELENIUM DOES NOT SUPPORT FOR REPORTS AND ASSERTION. WE NEED TO USE JUNIT, CUCUMBER, TESTNG.

public class RadioButton {
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
    public void testRadioButton() throws InterruptedException {
        driver.findElement(By.id("benzradio")).click();
        Thread.sleep(3000);
        boolean ans = driver.findElement(By.id("benzradio")).isSelected();
        if (ans == true);
        {
            System.out.println("This is true");
        }
//        assertEquals(true, ans);
//        System.out.println(ans);
        boolean ans2 = driver.findElement(By.id("hondaradio")).isSelected();
        assertEquals(false,ans2);
        System.out.println(ans2);


//    }
//    @Test
//    public void testDisplayed() throws InterruptedException {
//        driver.findElement(By.id("disabled-button")).click();
//        boolean ans =  driver.findElement(By.id("enabled-example-input")).isEnabled();
//        assertFalse(ans);
//
//        driver.findElement(By.id("enabled-button")).click();
//        boolean ans1 = driver.findElement(By.id("enabled-button")).isEnabled();
//        assertTrue(ans1);
//        driver.findElement(By.id("enabled-example-input")).sendKeys("Dipak");
//        Thread.sleep(3000);
    }
    @After
    public void tearDown(){

        driver.close();
    }

}
