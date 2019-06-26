package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrometest2 {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium-java-2.53.1\\selenium-2.53.1\\libs\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchTerm")).click();
        driver.findElement(By.id("searchTerm")).sendKeys("Tower fan");
        driver.findElement(By.cssSelector("button[class=_2mKaC]")).click();
        driver.findElement(By.xpath("//*[@id=\"__tealiumGDPRecModal\"]/div/div/div[2]/a")).click();
        driver.findElement(By.cssSelector("span[css=\"1\"]")).click();
        driver.quit();


//css syntax tag[attribute=value]

    }
}
