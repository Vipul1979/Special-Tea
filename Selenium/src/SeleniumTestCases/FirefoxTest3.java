package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest3 {
    public static void main (String[] args)throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        Thread.sleep(5000);
        driver.quit();

    }
}
