package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(4000);
        driver.findElement(By.className("email")).sendKeys("jbambhaniya7@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("Password")).sendKeys("London1233");
        Thread.sleep(3000);
        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@data-val-required=\"Email is required.\"")).sendKeys("jitesh77@gmail.com");
        Thread.sleep(3000);
        driver.close();
    }

}
