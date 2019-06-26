package basicweb;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementState {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com";
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @Test
    public void test(){

    }
    @Test
    public void teadDown()throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }
}

