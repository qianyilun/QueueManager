package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by yilunq on 07/08/17.
 */
public class CaptureElement {
    public static void main(String[] args) {
        // prevent java.lang.IllegalStateException
        String key = "webdriver.chrome.driver";
        String value = "/Users/Allen/Projects/QueueManager/src/chromedriver/chromedriver";
        System.setProperty(key, value);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String URL = "http://localhost:8080/myLogin/login";
        driver.get(URL);
        System.out.println(driver.getTitle());

        // Enter into unassigned queue
        WebElement element =  driver.findElement(By.xpath("/html/body/form/input[1]"));
        element.sendKeys("allen");
        driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("allen");
        driver.findElement(By.xpath("/html/body/form/input[3]")).click();

        driver.quit();
    }
}
