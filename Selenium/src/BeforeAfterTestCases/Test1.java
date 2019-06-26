package BeforeAfterTestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {
    //From Novice To Ninja Vedio 89
    WebDriver driver;
    String baseURL;
    @Before
    public void setUp()throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium-java-2.53.1\\selenium-2.53.1\\libs\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        baseURL="http://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void test(){
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("bhesaniav@gmail.com");
        driver.findElement(By.cssSelector("#user_password")).sendKeys("swamibapa");
        driver.findElement(By.cssSelector("#new_user > div.form-group.text-center > input")).click();
        //driver.findElement((By.xpath("//*[@id=\"user_email\"]"))).clear();
    }
    @After
    public void tearDown()throws Exception{

    }

}
