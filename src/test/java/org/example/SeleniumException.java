package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
// SELENIUM DOES NOT SUPPORT FOR REPORTS AND ASSERTION. WE NEED TO USE JUNIT, CUCUMBER, TESTNG.

public class SeleniumException {

//    NoSuchElementFound

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
        // findElement - no SuchException
        driver.findElement(By.id("benzradio")).click();
        // findElement - Empty No Exception
        //Interview Quastion different between find element and find elements method
        // and what type of exceptional you will get ? - - We will get empty list.

        List<WebElement> lableElements = driver.findElements(By.xpath("//div[@id='checkbox-example-div']/fieldset/label"));

        ArrayList<String> actualText = new ArrayList<String>();


        for (WebElement lableElement : lableElements) {
            actualText.add(lableElement.getText());
//            System.out.println(lableElement.getText());
        }
        System.out.println(actualText);
    }
    @After
    public void tearDown(){
        driver.close();
    }

}
