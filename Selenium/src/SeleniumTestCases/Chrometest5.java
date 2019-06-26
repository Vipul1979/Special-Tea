package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrometest5 {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium-java-2.53.1\\selenium-2.53.1\\libs\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1");
        driver.findElement(By.xpath("//input[@id=\"user_email\"]")).sendKeys("bhesaniav@gmail.com");
        driver.findElement(By.cssSelector("#user_password")).sendKeys("pramukh");
        driver.findElement(By.xpath("//input[@id=\"new_user\"]/div[3]/input")).click();

    }
}
