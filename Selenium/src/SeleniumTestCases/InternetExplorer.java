package SeleniumTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
    public static void main(String[] args){
        String baseURL = "http;//www.google.co.uk";
        System.setProperty("webdriver.ie.driver","C:\\Program Files\\selenium-java-2.53.1\\selenium-2.53.1\\libs\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
        WebDriver driver=new InternetExplorerDriver();
        driver.get(baseURL);
    }

}
