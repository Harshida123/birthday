package org.Argos.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    //Constant variable for webdriver
    public WebDriver driver;

    public DriverFactory() {

        //all web elements are initialize without explicitly each webelements by driver.
        PageFactory.initElements(driver, this);
    }

    public void OpenBrowser() {
//setup automatic system properties without providing path
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    public void CloseBrowser() {

        driver.quit();
    }


}
