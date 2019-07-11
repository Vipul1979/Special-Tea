package com.cucumberdemo.Stepdef;

import com.cucumberdemo.pageObjectModel.HomePage;
import com.cucumberdemo.pageObjectModel.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class SearchSteps {
    private HomePage homePage = new HomePage();
    private ResultPage resultPage = new ResultPage();

    @Given("^user is on home page$")
    public void user_is_on_home_page() {
     String actual = homePage.getHomePageUrl();
        Assert.assertThat(actual, Matchers.endsWith("co.uk/"));
    }

    @When("^user want to search for product \"([^\"]*)\"$")
    public void user_want_to_search_for_product(String arg1)  {
    homePage.doSearch("nike");


    }

    @Then("^user should see respective products$")
    public void user_should_see_respective_products() {
    String actual1 = resultPage.getResultPageUrl();
    Assert.assertThat(actual1,Matchers.endsWith("search/nike/?clickOrigin=searchbar:home:term:nike"));
    }

}
