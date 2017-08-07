package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by yilunq on 07/08/17.
 */
public class CaptureElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
//        driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("allen");
//        driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("allen");
//        driver.findElement(By.xpath("/html/body/form/input[3]")).click();


    }
}
