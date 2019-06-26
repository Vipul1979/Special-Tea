import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriver3 {

    public static void main (String[] args){
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.sainsburys.co.uk/");
        obj.manage().window().maximize();
        obj.findElement(By.id("cookieContinue")).click();
        obj.findElement(By.id("headerSearchInput")).sendKeys("Anthisan");
        obj.findElement(By.xpath("//*[@id=\"headerSearch\"]/div[3]/div/button")).click();

    }
}
