package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class loginsteps {

   private WebDriver driver;

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @When("^User click on Practice link$")
    public void user_click_on_Practice_link() throws Throwable {
        WebElement Practicelink = driver.findElement(By.partialLinkText("Pract"));
        Practicelink.click();

    }

    @Then("^User can visit the practice page$")
    public void user_can_visit_the_practice_page() throws Throwable {


    }


}
