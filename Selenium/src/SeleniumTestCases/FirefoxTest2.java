package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.asda.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("search-field")).sendKeys("nurofen");
        driver.findElement(By.className("icon-search")).click();
        driver.findElement(By.xpath("//*[@id=\"listings\"]/div[2]/div/div/div/div[1]/div/div[1]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"add-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"closeButtonInErrorCase\"]/a")).click();

    }
}
