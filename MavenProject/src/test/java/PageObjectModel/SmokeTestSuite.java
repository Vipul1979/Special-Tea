package PageObjectModel;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.security.PrivateKey;
import java.util.List;

public class SmokeTestSuite extends Hooks{
    private HomePage homePage = new HomePage();
    private Helpers helpers = new Helpers();
    private ResultPage resultPage=new ResultPage();


    @Test
    public void ReviewTest(){
        homePage.dosearch("nike");
        helpers.sleep(3000);
        resultPage.SetectedPriceList();
        //from here we are doing asserton we can also print from here
        List<Double> actuallist=resultPage.CollectedPrice();
        Assert.assertThat(actuallist, Matchers.everyItem(Matchers.greaterThanOrEqualTo(10.00)));
        Assert.assertThat(actuallist,Matchers.everyItem(Matchers.lessThanOrEqualTo(15.00)));
    }

}

