package FirstProject.BDDPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginPracticePage {
    public static void main (String[] arg){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        WebElement Practicelink=driver.findElement(By.partialLinkText("Pract"));
        Practicelink.click();
        WebElement BMWcar=driver.findElement(By.id("bmwradio"));
        BMWcar.click();
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        driver.quit();
    }
}
/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumLoginTestForBDD {
    public static void main (String[]args){
        WebDriver driver=new FirefoxDriver();
       driver.get("https://learn.letskodeit.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        WebElement Practicelink= driver.findElement(By.partialLinkText("Pract"));
       Practicelink.click();
       WebElement Bmwcar=driver.findElement(By.id("bmwradio"));
       Bmwcar.click();
       driver.quit();

    }
}
*/