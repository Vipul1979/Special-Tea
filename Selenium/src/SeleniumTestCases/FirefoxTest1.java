package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest1 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baps.org");
        driver.manage().window().maximize();
        driver.findElement(By.className("bapslogo"));
        Thread.sleep(5000); //sleep showing exception so write throws InterruptedException
        driver.quit();

    }

}
