package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.PanelUI;

import static org.junit.Assert.*;

public class CheckBox {

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
    public void testCheckBox(){
        driver.findElement(By.id("hondacheck")).click();
        driver.findElement(By.id("benzcheck")).click();
        boolean ans = driver.findElement(By.id("hondacheck")).isSelected();
        assertEquals(true,ans);

        boolean ans1 = driver.findElement(By.id("benzcheck")).isSelected();
        assertTrue("Honda Car is Selected",ans1);

        boolean ans2 = driver.findElement(By.id("bmwcheck")).isSelected();
        assertFalse("BMW is not Selected",ans2);

    }
    @After
    public void tearDown(){

        driver.close();
    }

}
