package com.cucumberdemo.pageObjectModel;

import com.cucumberdemo.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;

public class ResultPage extends DriverFactory {
    @FindBy(css = ".ac-facet__filter.ac-facet__filter--default ")
    List<WebElement> priceranges;

    @FindBy(css = ".ac-product-card__prices-and-offers")
    List<WebElement> prices;

    public String getResultPageUrl() {
        return driver.getCurrentUrl();
    }

    public void selectpricerange() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = priceranges.get(0);
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

    public List<Double> getallpricesofselectedproducts() {
        List<Double> selectedprices = new ArrayList<Double>(); //empty list created
        List<WebElement> priceelements = driver.findElements(By.className("ac-product-price__amount"));
        for (WebElement priceelement : priceelements) {
            String stringvalue = priceelement.getText().replaceFirst("£", "");
            double doublevalue = Double.parseDouble(stringvalue);
            selectedprices.add(doublevalue);
            System.out.println(selectedprices);
        }
            return selectedprices;


    }
}
