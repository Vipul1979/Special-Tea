package PageObjectModel1;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SmokeSuitTest1 {
    private Homepage1 homepage = new Homepage1();
    private Helper1 helpers = new Helper1();
    private ResultPage1 resultpage=new ResultPage1();

    @Test
    public void ReviewTest1() {
        homepage.dosearch("nike");
        helpers.sleep(5000);
        resultpage.selectedPriceList();

        List<Double> actuallist = resultpage.CollectedPrice();
        //Assert.assertThat(actuallist, Matchers.everyItem(Matchers.greaterThanOrEqualTo(10)));
        //Assert.assertThat(actuallist, Matchers.everyItem(Matchers.lessThanOrEqualTo(15)));
    }}



