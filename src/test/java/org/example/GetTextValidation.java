package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;


public class GetTextValidation {

    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";
    String expectedText = "SIGN IN";

    String expectedTableText = "Selenium WebDriver With Java";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void testSignInText () throws InterruptedException {
//        String actualText = driver.findElement(By.linkText("SIGN IN")).getText();
////        Thread.sleep(3000);
//        System.out.println(actualText);
////        assertEquals("Text is not equal and the test is failed",actualText);

        for (int i=2; i<4; i++){
            for (int j=1; j<3; j++ ){
//              String actualTableText = driver.findElement(By.xpath("//table[@id=\"product\"]/tbody/tr[2]/th[2]"));
//              assertEquals("Text is not expected",expectedText,actualTableText);
            }
        }
//      String actualTableText = driver.findElement(By.xpath("//table[@id=\"product\"]/tbody/tr[2]/th[2]"));
//        assertEquals("Text is not expected",expectedText);


    }


    @After
    public void tearDown(){

        driver.close();
    }
}
