package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NavigatingBetweenPages {
    WebDriver driver;
    String baseUrl;
    @Before
    public void setUp()throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void test()throws InterruptedException{
        driver.get(baseUrl);
        String title = driver.getTitle(); //save Tile in to title variable
        System.out.println("Title of the page is:" +title);

        String currentUrl = driver.getCurrentUrl(); //save url in currentUrl variable
        System.out.println("Current URL is:" + currentUrl);

        String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
        //No from firefoz Click on log in button in teachable kode it website,
        // and copy URL from browse then save it her in urlToNavigate variable
        driver.navigate().to(urlToNavigate);
        driver.getCurrentUrl();
        currentUrl=driver.getCurrentUrl();
        System.out.println("Current URL is:" +currentUrl);

        Thread.sleep(2000); // write throws exception on test
        driver.navigate().back();
        System.out.println("Navigate Back:");
        currentUrl=driver.getCurrentUrl();
        System.out.println("Current URL is:" +currentUrl);

        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println("Navigate forward");
        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is:" +currentUrl);

        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println(("Navigate Refresh"));
        driver.get(currentUrl);
        System.out.println("Navigate Refresh");

        String PageSource =driver.getPageSource();
    }
    @After
    public void teardown()throws Exception{

    }

}
