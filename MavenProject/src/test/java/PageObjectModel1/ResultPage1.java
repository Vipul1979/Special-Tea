package PageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultPage1 extends Hooks1{
   //First method to select £10 to £15 price
    public void selectedPriceList(){
        List<WebElement> PriceList = driver.
                findElements(By.cssSelector(".ac-facet__filters.ac-facet__filters--default"));
        WebElement Price = PriceList.get(1);
        Price.click();
    }
    //Second method now we have 19 Product with price between £10 and £15
        public List<Double> CollectedPrice(){
            List<Double> Prices = new ArrayList<Double>();
            List<WebElement> PriceListFor19Item = driver.findElements(By.cssSelector(".ac-product-price__amount"));
            for (WebElement PriceList:PriceListFor19Item){
                String ValuInAString = PriceList.getText().replaceFirst("£","");

                double ValueInADouble = Double.parseDouble(ValuInAString);
                Prices.add(ValueInADouble);
                System.out.println(Prices);
            }
                return Prices;
    }
}
