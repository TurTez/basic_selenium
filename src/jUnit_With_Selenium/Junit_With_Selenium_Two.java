package jUnit_With_Selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_With_Selenium_Two {
public static WebDriver driver;
    @Before
    public void lunchBrowser(){
        driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
    }
    @Test
    public void testAmazon() throws InterruptedException{
        String actualTitle = driver.getTitle();// Title of the web page
        Assert.assertArrayEquals("Do the Title match", "Amazon.com. Spend less. Smile more.",actualTitle);
        WebElement searchBox = driver.findElement(By.id("twotopsearchtextboz"));
        searchBox.click();
        searchBox.sendKeys("Blinds");

        @After

        public void closeUp(){
            if (driver instanceof ChromeDriver)
                driver.quit();
        }else{
            driver.close(); }



    }
}
