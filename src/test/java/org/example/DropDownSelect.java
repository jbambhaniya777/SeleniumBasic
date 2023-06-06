package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;


public class DropDownSelect {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";
    String expectedText = "Benz";

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void testDropDwon() throws InterruptedException {
        WebElement dropDown = driver.findElement(By.id("carselect"));
        Select select = new Select(dropDown);
//        select.selectByVisibleText("Honda");
        select.selectByIndex(1);
        Thread.sleep(3000);
        String actual = select.getFirstSelectedOption().getText();
//       assertEquals("Select class is not working", actual);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options){
            System.out.println(option.getText());
        }


//        select.selectByValue("bmw");
//        Thread.sleep(3000);
//
//        select.selectByIndex(1);
//        Thread.sleep(4000);
    }
    @Test
    public void testMultipleSelect() throws InterruptedException {
        WebElement testMultiple = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(testMultiple);
        select.selectByIndex(0);
        Thread.sleep(3000);

        select.selectByValue("orange");
        Thread.sleep(3000);

        select.selectByVisibleText("Peach");
        Thread.sleep(3000);

    }
    @After
    public void tearDown(){

        driver.close();
    }

}
