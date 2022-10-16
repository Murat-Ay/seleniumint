package ders07_handleDropdownMenu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class handleDropdownMenu {
    WebDriver driver;
    @Before
    public void setup( ) {
        WebDriverManager WebDriverManeger;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 15 ) );
        driver.manage().window().maximize();
    }
    @Test
    public void dropdownTest(){
        driver.get( "https//:amazon.com" );
        WebElement dropdownWebelement=driver.findElement( By.id( "searchDropdownBox" ) );
        Select select=new Select(dropdownWebelement);
        select.selectByVisibleText( "Electronics" );
        WebElement aramaKutusu= driver.findElement(By.id( "twotabsearchtexbox" ));
        aramaKutusu.sendKeys("java"+ Keys.ENTER );
    }

@After
public void teardown(){
    driver.close();

}}
