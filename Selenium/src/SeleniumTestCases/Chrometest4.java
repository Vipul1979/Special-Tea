package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrometest4 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium-java-2.53.1\\selenium-2.53.1\\libs\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("bhesaniav@gmail.com");
        driver.findElement(By.cssSelector("#user_password")).sendKeys("pramukh");
        driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[3]/input")).click();



    }
}
