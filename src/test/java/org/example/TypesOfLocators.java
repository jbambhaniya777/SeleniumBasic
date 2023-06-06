package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfLocators {
    static WebDriver driver;
    @Before
    public void setup () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void openNopCommerce() {
        driver.get("https://demo.nopcommerce.com/");
    }
    @After
    public void tearDown (){
        driver.close();
    }
}
