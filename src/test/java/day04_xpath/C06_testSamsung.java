package day04_xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class C06_testSamsung {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver","src/test/chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 12 ) );
        driver.get( "https://www.amazon.de" );
        Thread.sleep( 1000 );
        WebElement amazonAramaButonu= driver.findElement( By.id("twotabsearchtextbox"));
        amazonAramaButonu.click();
        amazonAramaButonu.sendKeys( "samsung a52" );
        amazonAramaButonu.submit();
        amazonAramaButonu.clear();
        amazonAramaButonu.sendKeys( "samsung a71" );
        amazonAramaButonu.submit();
        driver.close();

    }
}
