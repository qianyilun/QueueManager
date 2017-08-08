package com;

/**
 * Created by Allen on 2017-08-07.
 */
public class Main {
    public static void main(String[] args) {
        String key = "webdriver.chrome.driver";
        String value = "/Users/Allen/Projects/QueueManager/src/chromedriver/chromedriver";
        String URL = "http://localhost:8080/myLogin/login";

        new CaptureIRT().run(key, value, URL);
    }
}
