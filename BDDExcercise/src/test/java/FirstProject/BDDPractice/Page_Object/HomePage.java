package FirstProject.BDDPractice.Page_Object;

import FirstProject.BDDPractice.Driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {
    public static  String searchedProduct;

    @FindBy(id ="searchTerm")
    private WebElement searchTxtBox;

    @FindBy(css = "button[type='submit']")
    private WebElement magnifierGlass;

    public void dosearch(String item) {
        searchedProduct=item;
        searchTxtBox.sendKeys(item);
        magnifierGlass.click();
    }


    public String getHomePageUrl(){
        return driver.getCurrentUrl();
    }


}
