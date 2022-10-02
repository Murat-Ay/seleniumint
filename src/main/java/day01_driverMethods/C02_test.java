package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_test {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.com");
}}
