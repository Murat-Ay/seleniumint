package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class By_xpathID {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement( By.xpath("//a[@id='alerts']")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("20"+ Keys.ENTER);
        Thread.sleep(1000);

        String expectedText = "Submitted Values";
        String actualText = driver.findElement(By.xpath("//p[text()='Submitted Values']")).getText();

        if (expectedText.equals(actualText)) System.out.println("Test Passed");
        else System.out.println("Test Failed");

        driver.close();
    }
}
