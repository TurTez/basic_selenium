package basic_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class second_Selenium_Project {
    /*
    First Test Case: Goto amazon.com search term for TV
    1. Open the browser
    2. Navigate to google.com
    3. Type in the term inside the search box
    4. Click on search button or hit enter
    5. Close the browser
     */
    public static void main(String[] args) throws InterruptedException {

        //interface               //class
        WebDriver driver = new EdgeDriver();// Step 1

        driver.manage().window().maximize();//optional

        driver.get("https://amazon.com");//Step 2

        driver.manage().deleteAllCookies();//optional

        WebElement element = driver.findElement(By.id("twotabsearchtextbox")); //Step 3 part 1

        element.click();

        element.sendKeys("TV");//Step 3 part 2

        element.sendKeys(Keys.ENTER); //Step 4

        Thread.sleep(5000); //This is not recommended to use in anypoint in Selenium

        driver.close();
    }
}
