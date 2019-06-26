package BeforeAfterTestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//Run Junit programme, we use Junit to run programmes without main method.
public class BeforeAfterTestCase2 {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setUp()throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium-java-2.53.1\\selenium-2.53.1\\libs\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https:\\www.letskodeit.teacheable.com";
    }

    @Test
    public void test()throws InterruptedException{
            driver.get(baseUrl);
            String currentUrl = driver.getCurrentUrl();
            System.out.println("CurrentUrl: " +currentUrl);

            Thread.sleep(2000);
            driver.navigate().back();

            Thread.sleep(2000);
            driver.navigate().forward();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
    @After
    public void tearDown()throws Exception{
        driver.quit();
    }
}
