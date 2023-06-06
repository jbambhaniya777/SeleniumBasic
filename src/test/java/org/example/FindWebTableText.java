package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
public class FindWebTableText {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }


    @Test

    public void findTableText(){
//        String actualTableText = driver.findElement(By.xpath("//table[@id=\"product\"]/tbody/tr[2]/th[2]"));
//        assertEquals("Text is not expected",expexted);
    }

    @After
    public void tearDown(){

        driver.close();
    }

}
