package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrometest3 {
    public static void main (String[] args)throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium-java-2.53.1\\selenium-2.53.1\\libs\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.quit();
    }
}