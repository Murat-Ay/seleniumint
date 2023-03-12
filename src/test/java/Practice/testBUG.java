package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class testBUG {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(5));

        driver.get("https://www.hepsiburada.com");

        WebElement aramaMotoru= driver.findElement(By.className( "desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b"));
        aramaMotoru.sendKeys( "elektronik" + Keys.ENTER );
        driver.findElement( By.className( "horizontalSortingBar-PkoDOH7UsCwBrQaQx9bn" ) );
    }
}
