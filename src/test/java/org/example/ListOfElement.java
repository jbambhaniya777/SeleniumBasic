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

public class ListOfElement {

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
    public void getListOfCars(){
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

