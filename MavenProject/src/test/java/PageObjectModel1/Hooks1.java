package PageObjectModel1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks1 {
    public static WebDriver driver;
    public String browser="";
    @After
    public void tearDown(){

    }
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
}
