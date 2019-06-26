package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest1 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium-java-2.53.1\\selenium-2.53.1\\libs\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.baps.org");
        /*when above website open now we need to add wait time 5 second but it shows exception
        so we have to throws InterruptedExeption in main method*/
        Thread.sleep(5000); //when we wrtie this sleep showing exception so write throws in main method
        driver.quit();


    }
}
//please download chrome from https://chromedriver.storage.googleapis.com/index.html