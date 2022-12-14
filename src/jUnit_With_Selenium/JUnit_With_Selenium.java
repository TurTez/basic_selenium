package jUnit_With_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnit_With_Selenium {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));

        element.click();
        element.sendKeys("Pencil");
        element.sendKeys(Keys.ENTER);

        driver.close();
    }
}
