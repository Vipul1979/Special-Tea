package FirstProject.BDDPractice.Page_Object;

import FirstProject.BDDPractice.Driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends DriverFactory {

    public static String expectedCustomerRating;

    @FindBy(css = ".ac-facet__filters--rating .ac-facet__label--rating")
    private List<WebElement> customerRatings;

    @FindBy(css = ".ac-star-rating")
    private List<WebElement> ratingWebElemenntAttributes;


    public void selectARating(String selected) {
        for (WebElement ratinngWebElemnet : customerRatings) {
            if (ratinngWebElemnet.getText().equalsIgnoreCase(selected))
                expectedCustomerRating = selected;
            ratinngWebElemnet.click();
            break;
        }
    }
}


