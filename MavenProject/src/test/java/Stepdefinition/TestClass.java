package Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestClass {
    WebDriver driver;
    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page()  {
        // Write code here that turns the phrase above into concrete actions
        WebDriver driver=new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

    }

    @When("^User click on Practice link$")
    public void user_click_on_Practice_link()  {
        // Write code here that turns the phrase above into concrete actions
        WebElement Practicelink= driver.findElement(By.partialLinkText("Pract"));
        Practicelink.click();

    }

    @Then("^User can visit the practice page$")
    public void user_can_visit_the_practice_page()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^on the Practice page user can click on Bmw car$")
    public void on_the_Practice_page_user_can_click_on_Bmw_car()  {
        // Write code here that turns the phrase above into concrete actions
        WebElement Bmwcar=driver.findElement(By.id("bmwradio"));
        Bmwcar.click();


    }

    @Then("^user can close the broswer$")
    public void user_can_close_the_broswer()  {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();

    }

}
