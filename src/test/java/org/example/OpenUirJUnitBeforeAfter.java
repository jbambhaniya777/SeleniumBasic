package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUirJUnitBeforeAfter {
   static WebDriver driver;
   @Before
   public void setup (){
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
   }
    @Test
    public void openNetflix () {

        driver.get("https://www.netflix.com/gb/");
    }
    @Test
    public void openNext () {
        driver.get("https://www.next.co.uk/");
    }
    @Test
    public void openTesco () {
        driver.get("https://www.tesco.com/");
    }
    @After
    public void tearDown (){
        driver.close();
    }
}

