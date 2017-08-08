package com;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by yilunq on 07/08/17.
 *
 * https://jsoup.org/cookbook/extracting-data/dom-navigation
 */
public class CaptureIRT {

    public void run(String key, String value, String URL) {
        // prevent java.lang.IllegalStateException
        System.setProperty(key, value);

        // Establish connection
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        capture(driver);

        driver.quit();
    }

    public void capture(WebDriver driver) {
        // Enter into unassigned queue
        WebElement element =  driver.findElement(By.xpath("/html/body/form/input[1]"));
        element.sendKeys("allen");
        driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("allen");
        driver.findElement(By.xpath("/html/body/form/input[3]")).click();

        String getSourcePage = driver.getPageSource();
        Document doc = Jsoup.parse(getSourcePage);

        // Get IRT number
        Elements contents = doc.getElementsByClass("");

        // --- continue your code here
    }
}
