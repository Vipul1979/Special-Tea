package com.cucumberdemo.Stepdef;

import com.cucumberdemo.pageObjectModel.ResultPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.List;

public class FilterSteps {
    private ResultPage resultPage = new ResultPage();

    @Then("^user want to search products for pricerange filter$")
    public void user_want_to_search_products_for_pricerange_filter()  {
    resultPage.selectpricerange();
    }

    @When("^user select one of the pricerange filter$")
    public void user_select_one_of_the_pricerange_filter()  {

    }

    @Then("^user should see respected pricerange products$")
    public void user_should_see_respected_pricerange_products()  {
       List<Double> actuallist = resultPage.getallpricesofselectedproducts();
        Assert.assertThat(actuallist, Matchers.everyItem(Matchers.greaterThanOrEqualTo(5.0)));
        Assert.assertThat(actuallist,Matchers.everyItem(Matchers.lessThanOrEqualTo(10.0)));


    }


}
